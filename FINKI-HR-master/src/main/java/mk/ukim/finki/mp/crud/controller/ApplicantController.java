package mk.ukim.finki.mp.crud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import mk.ukim.finki.mp.crud.UserValidator;
import mk.ukim.finki.mp.crud.model.User;
import mk.ukim.finki.mp.crud.model.UserJobPosition;
import mk.ukim.finki.mp.crud.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicantController {
	@Autowired
	private UserService userService;



	@RequestMapping(value = "/aplicators")
	public ModelAndView list(HttpSession session) {
		
		
		
		ModelAndView res = new ModelAndView("aplicators");
		
		
		List<User> allUsers = userService.getAllUsers();
		
		
			
			List<User> aplicatorsList = userService.applicant("aplicant", allUsers);
		
		
		res.addObject("aplicators", aplicatorsList);
		
		
		return res;
	}
}
