package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.utility.DButil;

public class Crimedaoimpl implements CrimeDao {

	@Override
	public String register(int crimeid, String place, String modeodcrime, String victims, String detaildesc,
			String nameodsuspect, String Date,String status) {
		String message = "Not Inserted..";
		try (Connection conn= DButil.provideconnection()){
			PreparedStatement ps= conn.prepareStatement
					("insert into Crimedetail values(?,?,?,?,?,?,?,?)");
			    ps.setInt(1, crimeid);
				ps.setString(2, place);
				ps.setString(3, modeodcrime);
				ps.setString(4, victims);
				ps.setString(5, detaildesc);
				ps.setString(6, nameodsuspect);
				ps.setString(7, Date);
			    ps.setString(8,status);
				int x=ps.executeUpdate();
				if(x>0) {
					 message="updated";
				}
				
					
				
				
			
		} catch (SQLException e) {
		System.out.println( e.getMessage());;
		}
		return message;
	}

}
