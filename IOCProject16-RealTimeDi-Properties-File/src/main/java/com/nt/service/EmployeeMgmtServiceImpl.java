package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDao;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtservice {

	//HAS-A property
	private IEmployeeDao dao;
	
	private String osName;
	private String path;
	
	
	public void setOsName(String osName) {
		System.out.println("EmployeeMgmtServiceImpl.setOsName()");
		this.osName = osName;
	}


	public void setPath(String path) {
		System.out.println("EmployeeMgmtServiceImpl.setPath()");
		this.path = path;
	}


	public EmployeeMgmtServiceImpl(IEmployeeDao dao) {
		System.out.println("EmployeeMgmtServiceImpl::1 param constructor");
		this.dao = dao;
	}


	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {

		System.out.println("EmployeeMgmtServiceImpl.registerEmployee() osname="+osName+"path="+path);
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
