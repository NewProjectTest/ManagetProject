package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	 AdminService service;
	@RequestMapping(value = "login")
	public void login(String accounts,String password,HttpServletRequest req,HttpServletResponse resp){
		System.out.println(accounts +"---"+password);
	}
	
}