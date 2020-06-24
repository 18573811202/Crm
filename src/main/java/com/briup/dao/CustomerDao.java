package com.briup.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.briup.bean.Customer;

/** 
* @author 作者 zcg: 
* @version 创建时间：Apr 3, 2020 10:46:14 AM 
* 类说明 
* 与客户相关的dao层
*/
public interface CustomerDao extends JpaRepository<Customer,Integer> {

		//客户管理相关内容
	
	
		//数据分析相关内容
		List<Customer> findByRegion(String region);
		List<Customer> findByLevel(String level);
}













