package com.crime.usecases;

import java.util.Scanner;

import com.crime.Exception.USerdefined;
import com.crime.dao.Policedao;
import com.crime.dao.Policedaoimpl;

public class Policeusecase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	String pname=sc.next();
	System.out.println("ENter password");
	String password=sc.next();
	
	Policedao p=new Policedaoimpl();
	
	try {
		System.out.println(p.login(pname, password));
	} catch (USerdefined e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
