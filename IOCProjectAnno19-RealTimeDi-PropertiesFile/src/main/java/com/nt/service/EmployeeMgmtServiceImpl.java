package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDao;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtservice {

	//HAS-A property
	@Autowired
	@Qualifier("dbOperation")
	private IEmployeeDao dao;
	
	//constructor injection not required


	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {

		System.out.println("EmployeeMgmtServiceImpl.registerEmployee()");
		//write b.logic to calculate grossSalary and NetSalary
		float grossSalary=dto.getBasicsalary()+dto.getBasicsalary()*0.4f;//+40% on basic salary
		float netSalary=grossSalary - dto.getBasicsalary()*0.2f;//-20% on grossSalary
		//prepare BO class having persistable data
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicsalary(dto.getBasicsalary());
		bo.setGrosssalary(grossSalary );
		bo.setNetsalary(netSalary);
		
		//use DAO
		int count=dao.insertEmployee(bo);
		
		//generate final result
		return count==1?"Employee registered with net salary ::"+netSalary:"Employee not registered with net salary :"+netSalary;
		
	}

}
