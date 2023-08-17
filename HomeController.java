package Login.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Login.Enitites.Players;
import Login.Enitites.User;
import Login.services.PlayerService;
import Login.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService service;
	@Autowired
	private PlayerService playerService;

	@RequestMapping(path="/",method=RequestMethod.GET)
	public String homePageShow() {
		return "homrPage";	
	}
	
	@RequestMapping(path="/registration",method=RequestMethod.GET)
	public String registerShow() {
		return "register";	
	}
	
	@RequestMapping(path="/registration",method=RequestMethod.POST)
	public String registrationProcess(Model model,@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("pwd") String pwd) {
		System.out.println(name+email+pwd);
		User user=new User(name,email,pwd);
//		ApplicationContext context=new ClassPathXmlApplicationContext("Login/configuration/config.xml");
//		UserDao dao=(UserDao) context.getBean("userDao");
//		dao.Insert(user);
		service.InsertData(user);
		System.out.println();
		model.addAttribute("msg", "Thank you for registration... Now you can login..");
		return "login";
	}
	
	@RequestMapping(path="/login")
	public String LoginFormShow() {
//		return "login";
		return "redirect:/dashbord";
	}
	
	@RequestMapping(path="/loginProcess",method=RequestMethod.POST)
	public String loginProcess(Model model,@RequestParam("name") String name,@RequestParam("pwd") String pwd,HttpServletRequest req,RedirectAttributes redirectAttributes) {
		System.out.println(name+pwd);
		User user=service.getUserByName(name);
		if(user == null) {
			redirectAttributes.addFlashAttribute("message", "Please Register Yourself first!");
			return "redirect:/registration";
		}
		if(service.checkPwd(user, pwd)) {
			HttpSession session=req.getSession();
			session.setAttribute("userName", user.getName());
//			session.removeAttribute("userName");
			return "redirect:/dashbord";
		}
		model.addAttribute("errorMsg", "Invalid credentials...");
		return "login";
		
	}
	
	@RequestMapping(path="/dashbord")
	public String dashbord(Model model) {
		List<Players> players=playerService.getAll();
		model.addAttribute("players", players);
		return "dashbord";
	}
	
	
}
