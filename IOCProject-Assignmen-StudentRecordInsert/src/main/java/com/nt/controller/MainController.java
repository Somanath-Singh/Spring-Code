package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.IStudentMgmtService;
import com.nt.vo.StudentVO;

public class MainController {
	
	//HAS-A property
	private IStudentMgmtService service;
	
	//constructor injection
	public MainController(IStudentMgmtService service) {
		System.out.println("MainController.MainController()::0-param constructor");
		this.service = service;
	}
	
	public String ProcessStudent(StudentVO vo) throws Exception {
		System.out.println("MainController.ProcessStudent()");
		
		String result=null;
		
		StudentDTO dto=new StudentDTO();
		dto.setSroll(Long.parseLong(vo.getSroll()));
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		result=service.registerStudent(dto);
		

		
		return result;
	}
	
	
	

}
