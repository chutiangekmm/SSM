package com.jbit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*���淽ʽextends AbstractController �̳�AbstractController
*��ʹ��handleRequestInternal����ӳ��
*ע�ⷽʽ��_2��
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
