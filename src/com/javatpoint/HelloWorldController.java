package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloWorldController 
{
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String mes="Hello Spring MVC how r u";
		return new ModelAndView("hellopage","message",mes);
	}
	@RequestMapping("/welcome")
	public ModelAndView welcomeWorld(){
		String mess="Hello Welcome to Spring MVC";
		return new ModelAndView("welcome","message",mess);
	}}
