package com.jbit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*使用注解方式进行映射
*/

@Controller
@RequestMapping("/index1")
public class IndexController_1{
	
	@RequestMapping("/index")
	public ModelAndView index(){
		System.out.println("Hello,Spring mvc!");
		return new ModelAndView("index");
	}

}
