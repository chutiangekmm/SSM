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

/*使用注解方式同时传递参数
 * 同时使用log4j输出日志
*/

@Controller
@RequestMapping("/index2")
public class IndexController_2{
	private Logger logger=Logger.getLogger(IndexController_2.class);
	
	
	
	//必须传入username才能打开页面否则400报错
	@RequestMapping("/welcome")
	public ModelAndView welcome(@RequestParam String username){
		logger.info("Hello,Spring mvc!");
		return new ModelAndView("index");
	}
	
	
	
	
	
	
	
	/*不必须传入username就可以打开的
	 *value="/welcomes"指定解析器地址
	 * method=RequestMethod.GET指定提交方法GET 或POST
	 * 可加入params="username"来指定需要传入username参数
	 */
	@RequestMapping(value="/welcomes",method=RequestMethod.GET)
	/*value指定参数名
	 *required是否必须传参数  false为非必要
	 *若要required=false生效则@RequestMapping内不可定义params="username"
	 */
	public ModelAndView welcomes(@RequestParam(value="username",required=false) 
									String username){
		logger.info("Hello,Spring mvc!"+username);
		return new ModelAndView("index");
	}
	
	
	/*
	 * 使用ModelAndView并将对象传给页面
	 */
	@RequestMapping(value="modelAndView",method=RequestMethod.GET)
	public ModelAndView modelAndView(@RequestParam(value="username",required=false)
			String username){
		  ModelAndView mView=new ModelAndView();//创建一个ModelAndView对象
		  mView.addObject("username", username);//添加模型数据
		  mView.addObject(username);//不指定KEY值时在界面上直接读取数值类型   在这里为String
		  mView.setViewName("index");//设置逻辑视图名
		  return mView;//返回ModelAndView对象
		
	}
	
	/*
	*使用ModelAndView并将对象传给页面
	*带Uers类同时使用上述数据传给页面
	*/
	@RequestMapping(value="index",method=RequestMethod.GET)
	public ModelAndView index(@RequestParam(value="username",required=false)
			String username){
		  ModelAndView mView=new ModelAndView();//创建一个ModelAndView对象
		 
		  mView.addObject(username);//不指定KEY值时在界面上直接读取数值类型   在这里为String
		  mView.setViewName("index");//设置逻辑视图名
		  User user=new User();
		  user.setUsername(username);
		  mView.addObject("mView", user);
		  return mView;//返回ModelAndView对象
		
	}
	
}
