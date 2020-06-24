package com.briup.service;
/** 
* @author 作者 zcg: 
* @version 创建时间：Mar 27, 2020 2:34:17 PM 
* 类说明 
*/

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap.Option;
import org.springframework.data.domain.Page;

import com.briup.bean.Role;

public interface IRoleService {
	/**
	 * 查询刚进入角色管理模块(第一页)的所有角色
	 * @return
	 */
	Page<Role> findAllRoles();
	
	/**
	 * 查询指定页上的数据信息。
	 * @param pageIndex
	 * @return
	 */
	Page<Role> findAllRoles(Integer pageIndex);
	
	/**
	 * 新增和修改
	 * @param role
	 */
	void saveRole(Role role);
	
	/**
	 * 通过id找到对应的Role
	 * @param id
	 * @return
	 */
	Role findRoleById(Integer id);
	
	/**
	 * 删除
	 * @param id 
	 */
	void deleteRole(Integer id);
	
	/**
	 * 查询所有角色信息
	 */
	List<Role> allRoles();
}













