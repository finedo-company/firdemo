package com.finedo.dao.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finedo.dao.interfaces.UserDao;
import com.finedo.dao.mapper.UserMapper;
import com.finedo.domain.User;

@Component
public class UserDaoImpl implements UserDao{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(String id) {
		return userMapper.getUserById(id);
	}

}
