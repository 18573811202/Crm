package com.briup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.briup.bean.Role;
import com.briup.bean.User;
import com.briup.dao.UserDao;
import com.briup.service.IUserService;

/**
 * @author 作者 zcg:
 * @version 创建时间：Mar 26, 2020 4:51:03 PM 类说明 : 和User用户相关的Service层逻辑
 */
@Service
public class UserServiceImpl implements IUserService {
	// dao层
	@Autowired
	private UserDao dao;

	@Override
	public User findByName(String name) {
		User user = dao.findByName(name);
		return user;
	}

	@Override
	public Page<User> findUsersByRole(Integer roleId) {
		return findUsersByRole(roleId, 0);
	}

	@Override
	public Page<User> findUsersByRole(Integer roleId, Integer pageIndex) {
		Page<User> users = null;
		if (roleId == null) {
			//将所有用户查询出来
			users = dao.findAll(PageRequest.of(pageIndex, 3));
		} else {
			//根据角色条件筛选用户
			Role role = new Role();
			role.setId(roleId);
			users = dao.findByRole(role, PageRequest.of(pageIndex, 3));
		}
		return users;
	}

	@Override
	public void saveUser(User user) {
		dao.save(user);
	}

	@Override
	public User findUserById(Integer id) {
		/*
		 * .get()：获取类对象
		 * .orElse(xxx)：获取类对象，同时如果对象不存在可以指定默认值。
		 */
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deleteUserById(Integer id) {
		dao.deleteUserById(id);
	}

	@Override
	public List<User> findByJingli(Integer id) {
		return dao.findByRoleId(id);
	}

}





