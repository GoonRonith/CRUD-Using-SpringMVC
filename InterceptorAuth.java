package Login.Interceptors;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorAuth extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object handler) throws ServletException, IOException {
		
		System.out.println("handler is called");
		HttpSession session=req.getSession();
		if(session.getAttribute("userName") != null) {
			return true;
		}
		  RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
	       dispatcher.forward(req, res);
		return false;
		
	}

}
