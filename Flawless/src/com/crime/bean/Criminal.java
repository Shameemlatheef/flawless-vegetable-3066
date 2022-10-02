package com.crime.bean;

public class Criminal {
private int id;
private String name;
private String gender;
private String address;
private String idmarks;
private String firstarrest;
private int caseno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getIdmarks() {
	return idmarks;
}
public void setIdmarks(String idmarks) {
	this.idmarks = idmarks;
}
public String getFirstarrest() {
	return firstarrest;
}
public void setFirstarrest(String firstarrest) {
	this.firstarrest = firstarrest;
}
public int getCaseno() {
	return caseno;
}
public void setCaseno(int caseno) {
	this.caseno = caseno;
}
@Override
public String toString() {
	return "Criminal [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", idmarks="
			+ idmarks + ", firstarrest=" + firstarrest + ", caseno=" + caseno + "]";
}
public Criminal(int id, String name, String gender, String address, String idmarks, String firstarrest, int caseno) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.address = address;
	this.idmarks = idmarks;
	this.firstarrest = firstarrest;
	this.caseno = caseno;
}
public Criminal() {
	// TODO Auto-generated constructor stub
}
}
