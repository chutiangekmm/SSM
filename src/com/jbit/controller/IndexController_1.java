package com.jbit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*ʹ��ע�ⷽʽ����ӳ��
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
