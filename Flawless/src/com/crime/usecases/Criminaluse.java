package com.crime.usecases;

import java.util.Scanner;

import com.crime.bean.Criminal;
import com.crime.dao.CriminalIMpl;
import com.crime.dao.Criminaldao;

public class Criminaluse {
public static void main(String[] args) {
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
