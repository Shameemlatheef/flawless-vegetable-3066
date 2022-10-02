package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.crime.Exception.USerdefined;
import com.crime.bean.Crimedetail;
import com.masai.utility.DButil;

public class SearchcaseDaoimpl implements SearchCaseDao{

	@Override
	public void Solved()  throws USerdefined{
		try (Connection conn=DButil.provideconnection()){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter option 1-solved/2-unsolved");
			int i=sc.nextInt();
			if(i==1) {
				
				PreparedStatement ps=conn.prepareStatement("select  * from Crimedetail where status='solved'");
			   
			   List<Crimedetail> a=new ArrayList<>();
			   ResultSet rs=ps.executeQuery();
			   while(rs.next()) {
				   int id=rs.getInt("crimeid");
				   String places=rs.getString("place");
				   String modeofcrimes=rs.getString("modeofcrime");
				   String victimss=rs.getString("victims");
				   String detaildescs=rs.getString("detaildesc");
				   String nameofsuspects=rs.getString(i);
				   String Dates=rs.getString("Date");
				   
				   String statuss=rs.getString("status");
				  
					a.add(new Crimedetail(id,places,modeofcrimes,victimss,detaildescs,nameofsuspects,Dates,statuss));
					
			   }
			  System.out.println("No of solved cases "+a.size());
			   
			
				
			}
			else if(i==2) {
				PreparedStatement ps=conn.prepareStatement("select  * from Crimedetail where status='unsolved'");
				   
				   List<Crimedetail> a=new ArrayList<>();
				   ResultSet rs=ps.executeQuery();
				   while(rs.next()) {
					   int id=rs.getInt("crimeid");
					   String places=rs.getString("place");
					   String modeofcrimes=rs.getString("modeofcrime");
					   String victimss=rs.getString("victims");
					   String detaildescs=rs.getString("detaildesc");
					   String nameofsuspects=rs.getString(i);
					   String Dates=rs.getString("Date");
					   
					   String statuss=rs.getString("status");
					  
						a.add(new Crimedetail(id,places,modeofcrimes,victimss,detaildescs,nameofsuspects,Dates,statuss));
						
				   }
				  System.out.println("No of unsolved cases "+a.size());
				   
			}
			else {
				 USerdefined us=new USerdefined("Invalid Option");
				 throw us;
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
