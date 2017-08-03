package com.jbit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*常规方式extends AbstractController 继承AbstractController
*后使用handleRequestInternal方法映射
*注解方式在_2中
*/
public class IndexController_0 extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello,Spring mvc!");
		return new ModelAndView("index");
	}

}
