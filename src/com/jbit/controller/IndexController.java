package com.jbit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*使用注解方式进行映射
*/

@Controller
@RequestMapping({"/index","/"})
public class IndexController{
	
	@RequestMapping("/index")
	public ModelAndView index(){
		System.out.println("Hello,Spring mvc!");
		return new ModelAndView("index");
	}

}
