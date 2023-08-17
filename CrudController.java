package Login.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Login.Enitites.Players;
import Login.services.PlayerService;



@Controller
public class CrudController {
	
	@Autowired
	private PlayerService service;
	
	@RequestMapping(path="/add",method=RequestMethod.GET)
	public String displayAddingForm(Model model) {
		return "addPlayer";
	}
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public String AddingProcess(Model model,@ModelAttribute("Players") Players player) {
		service.addPlayer(player);
//		model.addAttribute("msg", "successfully added");
		return "redirect:/dashbord";
		
	}
	
	@RequestMapping(path="/delete/{id}")
	public String deletingProcess(@PathVariable("id") int id) {
		service.deletePlayer(id);
		return "redirect:/dashbord";
	}
	
	@RequestMapping(path="/update/{id}")
	public String displayUpdatingForm(@PathVariable("id") int id,Model model) {
	System.out.println(id);
		Players player=service.getPlayerById(id);
		System.out.println(player);
		model.addAttribute("player", player);
		return "update_form";
	}
	
	@RequestMapping(path="/update/handle-update",method=RequestMethod.POST)
	public String updatingProcess(@ModelAttribute("Players") Players player) {
		service.addPlayer(player);
		return "redirect:/dashbord";
	}
	
	
	@RequestMapping("/logout")
	public String logoutController(HttpServletRequest req) {
		HttpSession session=req.getSession();
		session.removeAttribute("userName");
		return "homrPage";
		}

}

