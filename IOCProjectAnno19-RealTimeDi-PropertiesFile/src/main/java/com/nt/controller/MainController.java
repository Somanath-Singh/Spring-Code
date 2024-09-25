package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtservice;
import com.nt.vo.EmployeeVO;

@Controller("controller")
public class MainController {

	//HAS-A property
	
	@Autowired
	private IEmployeeMgmtservice service;

	//constructor injection not need
	
	//client gives input values to controller using VO class
	public String processEmployee(EmployeeVO vo)throws Exception{
		
		//convert EmployeeVO class object to EmployeeDTO class obj
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicsalary(Float.parseFloat(vo.getBasicsalary()));
		
		//use service
		String result=service.registerEmployee(dto);
		
		return result;
		
	}
	
	
}
