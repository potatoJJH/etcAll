package com.socialLogin.member;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	@Inject
	private SnsValue naverSns;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) throws Exception {
		SNSLogin snsLogin = new SNSLogin(naverSns);
		model.addAttribute("naver_url", snsLogin.getNaverAuthUrl());
		
		return "member/login";
	}
	
	@RequestMapping(value = "/loginOk", method = RequestMethod.GET)
	public String loginOk() {
		return "member/loginOk";
	}
}
