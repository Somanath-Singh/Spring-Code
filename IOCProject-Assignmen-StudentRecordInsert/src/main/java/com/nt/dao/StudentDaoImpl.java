package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDaoImpl implements IStudentDao {
	
	private static final String STUDENT_MARK_INSERT="INSERT INTO PROJECT_STUDENT(SROLL,M1,M2,M3,TOTAL,AVG) VALUES(?,?,?,?,?,?)";
	
	private DataSource ds;
	
	//constructor injection
	public StudentDaoImpl(DataSource ds) {
		System.out.println("StudentDaoImpl.StudentDaoImpl()::0-param constructor");
		this.ds = ds;
	}

	@Override
	public int insertStudentMark(StudentBO bo) throws Exception {
		
		System.out.println("StudentDaoImpl.insertStudentMark()");
		
		int result=0;
		
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(STUDENT_MARK_INSERT);)
		{
			//set the value to query param
			ps.setLong(1, bo.getSroll());
			ps.setInt(2, bo.getM1());
			ps.setInt(3, bo.getM2());
			ps.setInt(4, bo.getM3());
			ps.setInt(5, bo.getTotal());
			ps.setFloat(6, bo.getAvg());
			
			//execute the query
			result=ps.executeUpdate();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception se) {
			se.printStackTrace();
		    throw	se;
		}
		
		return result;
	}

	

}
