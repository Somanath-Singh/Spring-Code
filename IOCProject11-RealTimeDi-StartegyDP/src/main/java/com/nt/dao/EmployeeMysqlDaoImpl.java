package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeMysqlDaoImpl implements IEmployeeDao {

	private static final String EMP_INSERT_QUERY="INSERT INTO REALTIMEDI_SPRING_EMPLOYEE(ENAME,DESG,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?)";
	//HAS-A property
	private DataSource ds;
	
	
	public EmployeeMysqlDaoImpl(DataSource ds) {
		
		System.out.println("EmployeeMysqlDaoImpl :1-param constructor");
		this.ds = ds;
		
	}


	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {

		System.out.println("EmployeeMysqlDaoImpl.insertEmployee()");
		int result=0;
		
		try (//get the pooled jdbc  con object
				Connection con=ds.getConnection();
				//create preparedStatement object having query as the pre-compiled sql query
				PreparedStatement ps=con.prepareStatement(EMP_INSERT_QUERY);)
		{
			
			//set value to query param
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicsalary());
			ps.setFloat(4, bo.getGrosssalary());
			ps.setFloat(5, bo.getNetsalary());
			//execute the query
			result=ps.executeUpdate();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;//exception rethrow
		}
		catch(Exception se) {
			se.printStackTrace();
			throw se;//exception rethrow
		}
		
		return result;
		
	}

}
