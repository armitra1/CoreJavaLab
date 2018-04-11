package com.cg;

public class Date {
	int day;
	int month;
	int year;
	
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void displayDate(){
	System.out.println("The Joining Date: "+day+"/"+month+"/"+year);
	
}

}
