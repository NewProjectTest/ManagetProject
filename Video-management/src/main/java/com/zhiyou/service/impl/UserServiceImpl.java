package com.zhiyou.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper mapper;

	public void add(User user) {
		// TODO Auto-generated method stub
		mapper.add(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		mapper.update(user);
	}

	public User selectByAccounts(String account, HttpServletRequest req, String password) {
		// TODO Auto-generated method stub
		User user2 = mapper.selectByAccounts(account);

		if (user2.getAccounts() == "" || user2.getAccounts() == null) {
			req.setAttribute("date1", "fault");
		} else if (user2.getPassword() != password) {
			req.setAttribute("date1", "fault");
		} else {
			req.setAttribute("date1", "success");
		}
		return user2;

	}

}
