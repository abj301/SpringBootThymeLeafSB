package com.springBoot.LoginForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView showPage(CredentialInformation getCredentials, ModelAndView mv) {
		mv.addObject("CredentialInformationObj", getCredentials);
		mv.setViewName("home");
		return mv;
	}
}
