package com.crime.dao;

import com.crime.Exception.USerdefined;

public interface CrimeDao {
  
	public String register(int crimeid,String place,String modeofcrime,String victims,String detaildesc,String nameofsuspect,String Date ,String status) throws USerdefined;
	
	
}