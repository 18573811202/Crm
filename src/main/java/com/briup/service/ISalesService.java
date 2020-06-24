package com.briup.service;

import org.springframework.data.domain.Page;

import com.briup.bean.Chance;

/** 
* @author 作者 zcg: 
* @version 创建时间：Apr 2, 2020 2:13:09 PM 
* 类说明 
*/
public interface ISalesService {

	//新增销售商机
	void insertChance(Chance chance,Integer creatorId,Integer handlerId);
	
	//如果商机开发成功
	//void insertChance(Chance chance);
	
	//查询显示
	Page<Chance> getChances(String customer,String address);
	Page<Chance> getChances(Integer pageIndex,String customer,String address);
	
	//删除
	void deleteChance(Integer id);
	
	//根据id查询指定销售商机
	Chance findChanceById(Integer id);
	
}










