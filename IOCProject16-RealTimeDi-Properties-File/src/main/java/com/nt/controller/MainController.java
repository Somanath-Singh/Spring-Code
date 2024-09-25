package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtservice;
import com.nt.vo.EmployeeVO;

public class MainController {

	//HAS-A property
	
	private IEmployeeMgmtservice service;

	public MainController(IEmployeeMgmtservice service) {
		System.out.println("MainController::1-param constructor");
		this.service = service;
	}
	
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
