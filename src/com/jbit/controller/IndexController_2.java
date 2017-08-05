package com.jbit.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jbit.entity.User;

/*ʹ��ע�ⷽʽͬʱ���ݲ���
 * ͬʱʹ��log4j�����־
*/

@Controller
@RequestMapping("/index2")
public class IndexController_2{
	private Logger logger=Logger.getLogger(IndexController_2.class);
	
	
	
	//���봫��username���ܴ�ҳ�����400����
	@RequestMapping("/welcome")
	public ModelAndView welcome(@RequestParam String username){
		logger.info("Hello,Spring mvc!");
		return new ModelAndView("index");
	}
	
	
	
	
	
	
	
	/*�����봫��username�Ϳ��Դ򿪵�
	 *value="/welcomes"ָ����������ַ
	 * method=RequestMethod.GETָ���ύ����GET ��POST
	 * �ɼ���params="username"��ָ����Ҫ����username����
	 */
	@RequestMapping(value="/welcomes",method=RequestMethod.GET)
	/*valueָ��������
	 *required�Ƿ���봫����  falseΪ�Ǳ�Ҫ
	 *��Ҫrequired=false��Ч��@RequestMapping�ڲ��ɶ���params="username"
	 */
	public ModelAndView welcomes(@RequestParam(value="username",required=false) 
									String username){
		logger.info("Hello,Spring mvc!"+username);
		return new ModelAndView("index");
	}
	
	
	/*
	 * ʹ��ModelAndView�������󴫸�ҳ��
	 */
	@RequestMapping(value="modelAndView",method=RequestMethod.GET)
	public ModelAndView modelAndView(@RequestParam(value="username",required=false)
			String username){
		  ModelAndView mView=new ModelAndView();//����һ��ModelAndView����
		  mView.addObject("username", username);//���ģ������
		  mView.addObject(username);//��ָ��KEYֵʱ�ڽ�����ֱ�Ӷ�ȡ��ֵ����   ������ΪString
		  mView.setViewName("index");//�����߼���ͼ��
		  return mView;//����ModelAndView����
		
	}
	
	/*
	*ʹ��ModelAndView�������󴫸�ҳ��
	*��Uers��ͬʱʹ���������ݴ���ҳ��
	*/
	@RequestMapping(value="index",method=RequestMethod.GET)
	public ModelAndView index(@RequestParam(value="username",required=false)
			String username){
		  ModelAndView mView=new ModelAndView();//����һ��ModelAndView����
		 
		  mView.addObject(username);//��ָ��KEYֵʱ�ڽ�����ֱ�Ӷ�ȡ��ֵ����   ������ΪString
		  mView.setViewName("index");//�����߼���ͼ��
		  User user=new User();
		  user.setUsername(username);
		  mView.addObject("mView", user);
		  return mView;//����ModelAndView����
		
	}
	
}
