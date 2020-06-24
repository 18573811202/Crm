package com.briup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.briup.bean.Role;

/** 
* @author 作者 zcg: 
* @version 创建时间：Mar 27, 2020 2:46:24 PM 
* 类说明 :
* 	从数据库中查找role相关数据。使用默认提供的方法
*/
public interface RoleDao extends JpaRepository<Role, Integer>{

}
