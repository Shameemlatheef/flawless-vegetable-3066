package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.crime.bean.Criminal;
import com.masai.utility.DButil;

public class Policedaoimpl implements Policedao{

	@Override
	public String login(String pname, String password) {
		//Police pol=null;
		String message="incorect details";
		boolean sd=false;
		try (Connection conn=DButil.provideconnection()){
		PreparedStatement ps=conn.prepareStatement("select * from Police where name=? AND password=?");
		ps.setString(1, pname);
		ps.setString(2, password);
		
	     ResultSet sc=ps.executeQuery();
	     while(sc.next()) {	
			
			message="login succesful";
			Scanner si=new Scanner(System.in);
			System.out.println("Enter options 1(update)/2(search)");
		 int l=si.nextInt();
		 if(l==1) {
			 System.out.println("Enter option 1 (case diary) / 2 (Criminal details)");
				int i=si.nextInt();
				if(i==1) {
					Scanner st=new Scanner(System.in);
					System.out.println("Enter crime id");
					int crimeid=st.nextInt();
					System.out.println("Enter place of crime");
					String place=st.next();
					System.out.println("Enter mode of crime(theft/homicide/robbery");
					String mode=st.next();
					System.out.println("enter victims");
					String victim=st.next();
					System.out.println("Enter detail description");
					String desc=st.nextLine();
					st.nextLine();
					System.out.println("Enter name of suspect");
					String name=st.next();
					System.out.println("Enter date YYYY/MM/DD");
					String dat=st.next();
					System.out.println("Enter case status--Solved/Unsolved");
					String sts=st.next();
					
					CrimeDao dao= new Crimedaoimpl();
					String da=dao.register(crimeid, place, mode, victim, desc, name, dat, sts);
					System.out.println(da);
					
				}
				else if(i==2) {
			
					Scanner s=new Scanner(System.in);
					System.out.println("Enter id");
					int id=s.nextInt();
					System.out.println("Enter criminal name");
					String name=s.next();
					System.out.println("Enter gender");
					String gender=s.next();
					System.out.println("Enter address");
					String address=s.next();
					System.out.println("Enter identication marks");
					String idmarks=s.next();
					System.out.println("Enter area of first arrest");
					String areaofarrest=s.next();
					System.out.println("Enter caseno");
					int caseno=s.nextInt();
					Criminaldao f=new CriminalIMpl();
					Criminal d=new Criminal();
					d.setId(id);
					
					d.setName(name);
					d.setGender(gender);
					d.setAddress(address);
					d.setIdmarks(idmarks);
					d.setFirstarrest(areaofarrest);
				    d.setCaseno(caseno);
				    
				    System.out.println(f.Registercriminal(d));
				}
		 }
		 else if(l==2) {
			 
			 /////search option
			 
			 
			 
			 
			 
			 
			 
		 }
			
		}
		
		
	
	} catch (SQLException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
		
		return message;
	}

}
