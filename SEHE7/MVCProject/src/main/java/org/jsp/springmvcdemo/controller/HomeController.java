package org.jsp.springmvcdemo.controller;

import org.jsp.springmvcdemo.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="/open-home")
	public String openHome(Model model) {
		System.out.println("==============");
		model.addAttribute("username", "Harsha vardhan Reddy");
		return "home.jsp";
		
	}
	@RequestMapping(value="/findsum")
	public ModelAndView findsum(@RequestParam(name="n1") int n1,@RequestParam(name="n2") int n2) {
		String result="the sum is:"+(n1+n2);
		ModelAndView view =new ModelAndView();
		view.addObject("result",result);
		view.setViewName("print.jsp");
		return view;
		
	}
	@RequestMapping(value="/finddiff")
	public ModelAndView finddiffe(@RequestParam(name="n1") int n1,@RequestParam(name="n2") int n2) {
		String result="the difference is:"+(n1-n2);
		ModelAndView view =new ModelAndView();
		view.addObject("result",result);
		view.setViewName("print.jsp");
		return view;
		
	}
	@RequestMapping(value="/findmul")
	public ModelAndView findmul(@RequestParam(name="n1") int n1,@RequestParam(name="n2") int n2) {
		String result="The mul is:"+(n1*n2);
		ModelAndView view =new ModelAndView();
		view.addObject("result",result);
		view.setViewName("print.jsp");
		return view;
		
	}
	@RequestMapping(value="/finddiv")
	public ModelAndView finddiv(@RequestParam(name="n1") int n1,@RequestParam(name="n2") int n2) {
		String result="The div is:"+(n1/n2);
		ModelAndView view =new ModelAndView();
		view.addObject("result",result);
		view.setViewName("print.jsp");
		return view;
		
	}
	@RequestMapping(value="/print")
	public ModelAndView printDetails(@ModelAttribute User u) {
		System.out.println("Name:"+u.getName());
		System.out.println("phone:"+u.getPhone());
		System.out.println("Email:"+u.getEmail());
		System.out.println("Age:"+u.getAge());
		System.out.println("password:"+u.getPassword());
		 ModelAndView view =new  ModelAndView();
		 view.setViewName("print.jsp");
		 view.addObject("result","The details are printed");
		 return view;
		
		
	}

}
