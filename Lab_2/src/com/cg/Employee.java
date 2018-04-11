package com.cg;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	private String grade;
	
	public static int idCount;
	Date dateOfJoining;
	
	public Employee(String firstName,String lastName,double salary,String grade,Date dateOfJoining)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary   = salary;
		this.grade = grade;
		
		this.dateOfJoining = dateOfJoining;
		this.idCount = ++idCount;
		
	}
	public void Entry()
	{
		   System.out.println("Employee ID     : "+idCount);			
           System.out.println("First Name      : "+firstName);
           System.out.println("Last  Name      : "+lastName);
           System.out.println("Salary          : "+salary);
           System.out.println("Grade           : "+grade);
           
           
   }
	public void displaycount()
	{
		   System.out.println("Total entries present : "+idCount);	
		
	}

}
