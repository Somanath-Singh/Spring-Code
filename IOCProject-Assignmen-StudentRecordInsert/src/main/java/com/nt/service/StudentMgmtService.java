package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.IStudentDao;
import com.nt.dto.StudentDTO;

public class StudentMgmtService implements IStudentMgmtService {

private IStudentDao dao;
	
	//constructor injection
	public StudentMgmtService(IStudentDao dao) {
		System.out.println("StudentMgmtService.StudentMgmtService():0-param constructor");
		this.dao = dao;
	}
	
	@Override
	public String registerStudent(StudentDTO dto) throws Exception {
		
		System.out.println("StudentMgmtService.registerStudent()");
		
		String result=null;
		
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg=(float) ((total)*100/300.0);
		
		//pass the all data to VO class
		StudentBO bo=new StudentBO();
		bo.setSroll(dto.getSroll());
		bo.setM1(dto.getM1());
		bo.setM2(dto.getM2());
		bo.setM3(dto.getM3());
		bo.setTotal(total);
		bo.setAvg(avg);
		
		//call the Dao class Insert method
		int count=dao.insertStudentMark(bo);
		
		
		return count==1?"Student Mark saved successfully total mark:"+total:"Student Mark not saved total mark:"+total;
		
	}

}
