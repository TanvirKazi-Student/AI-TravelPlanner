package nt.travel.entity;

import lombok.Getter;
import lombok.Setter;

public class Generatetrip {

	private String location;
	private int days;
	private String buget;
	private int people;
	private  String partner;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getBuget() {
		return buget;
	}
	public void setBuget(String buget) {
		this.buget = buget;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	
	
	
}
