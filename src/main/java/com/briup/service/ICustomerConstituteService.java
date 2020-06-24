package com.briup.service;
/** 
* @author 作者 zcg: 
* @version 创建时间：Apr 3, 2020 10:43:50 AM 
* 类说明 
*/

import java.util.List;

import com.briup.bean.CustomerConstitute;

public interface ICustomerConstituteService {
	//地区分类
	List<CustomerConstitute> regionAnalyze();
	
	//等级分类
	List<CustomerConstitute> levelAnalyze();
}








