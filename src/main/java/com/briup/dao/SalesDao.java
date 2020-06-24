package com.briup.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.briup.bean.Chance;
import com.briup.bean.User;

/** 
* @author 作者 zcg: 
* @version 创建时间：Apr 2, 2020 2:13:55 PM 
* 类说明 
* 	销售商机管理的dao层
*/
public interface SalesDao extends JpaRepository<Chance, Integer>{
		
	//根据潜在客户名，查询对应的销售商机并分页
	Page<Chance> findByCustomerLike(String customer,Pageable pageable);
	
	//根据区域名，查询对应的销售商机并分页
	Page<Chance> findByAddress(String address,Pageable pageable);
	
	//根据客户经理，查询对应的销售商机并分页
	Page<Chance> findByHandler(User handler,Pageable pageable);
	
	//根据客户经理和区域，一起查询对应的销售商机并分页
	Page<Chance> findByHandlerAndAddress(User handler,String address,Pageable pageable);
	Page<Chance> findByCustomerAndAddress(String customer,String address,Pageable pageable);
	
}









