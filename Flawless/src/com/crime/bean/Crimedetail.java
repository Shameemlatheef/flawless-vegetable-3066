package com.crime.bean;

public class Crimedetail {
	private int crimeid;
	private String place;
	private String modeofcrime;
	private String victims;
	private String detaildesc;
	private String nameofsuspect;
	private String Date;
	private String status;
	public int getCrimeid() {
		return crimeid;
	}
	public void setCrimeid(int crimeid) {
		this.crimeid = crimeid;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getModeofcrime() {
		return modeofcrime;
	}
	public void setModeofcrime(String modeofcrime) {
		this.modeofcrime = modeofcrime;
	}
	public String getVictims() {
		return victims;
	}
	public void setVictims(String victims) {
		this.victims = victims;
	}
	public String getDetaildesc() {
		return detaildesc;
	}
	public void setDetaildesc(String detaildesc) {
		this.detaildesc = detaildesc;
	}
	public String getNameofsuspect() {
		return nameofsuspect;
	}
	public void setNameofsuspect(String nameofsuspect) {
		this.nameofsuspect = nameofsuspect;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Crimedetail(int crimeid, String place, String modeofcrime, String victims, String detaildesc,
			String nameofsuspect, String date, String status) {
		super();
		this.crimeid = crimeid;
		this.place = place;
		this.modeofcrime = modeofcrime;
		this.victims = victims;
		this.detaildesc = detaildesc;
		this.nameofsuspect = nameofsuspect;
		Date = date;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Crimedetail [crimeid=" + crimeid + ", place=" + place + ", modeofcrime=" + modeofcrime + ", victims="
				+ victims + ", detaildesc=" + detaildesc + ", nameofsuspect=" + nameofsuspect + ", Date=" + Date
				+ ", status=" + status + "]";
	}
}
