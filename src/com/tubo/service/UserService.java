package com.tubo.service;

import com.tubo.dao.UserDao;
import com.tubo.dao.UserDaoImple;
import com.tubo.vo.User;

public class UserService {

	public User login(User user) {
		UserDao dao = new UserDaoImple();
		return dao.login(user);
	}
	
	
}
