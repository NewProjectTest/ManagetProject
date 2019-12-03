package com.zhiyou.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService service;

	@RequestMapping("generalUserLogin")
	public String generalUserLogin(String email, String password, HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		service.selectByAccounts(email, req, password);
		String string = req.getParameter("date1");
		System.out.println(string);
		resp.getWriter().write(string);
		return "";
	}

	@RequestMapping("generalUserRegister")
	public String generalUserRegister() {

		return "";
	}

	@RequestMapping("adminLogin")
	public String adminLogin() {

		return "backstage/adminLogin";
	}
}
