package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crime.bean.Criminal;
import com.masai.utility.DButil;

public class CriminalIMpl implements Criminaldao {

	@Override
	public String Registercriminal(Criminal criminal) {
		String message="Not updated";
		try (Connection conn=DButil.provideconnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into Criminal values(?,?,?,?,?,?,?)");
			ps.setInt(1, criminal.getId());
			ps.setString(2, criminal.getName());
			ps.setString(3,criminal.getGender());
			ps.setString(4, criminal.getAddress());
			ps.setString(5, criminal.getIdmarks());
			ps.setString(6, criminal.getFirstarrest());
			ps.setInt(7, criminal.getCaseno());
			
			int c=ps.executeUpdate();
			if(c>0) {
				message="updated";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return message;
	}

}
