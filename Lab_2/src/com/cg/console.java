package com.cg;

public class console {
	public static void main(String[] args)
	{

    	 Date doj  = new Date(13,9,2017); 
    	 Employee emp = new Employee("Arnab","Mitra",35000,"a5", doj);
    	 emp.Entry();
    	 doj.displayDate();
     	
         doj  = new Date(19,01,2018);
    	 emp = new Employee("Arnab","Dutta",15000,"a5",doj);	    
         emp.Entry();	
         doj.displayDate();
         
         doj  = new Date(13,9,2017);
    	 emp = new Employee("Arnab","Nandi",35000,"a3",doj);	    
         emp.Entry();	
         doj.displayDate();
         
         doj  = new Date(7,3,2018);
    	 emp =  new Employee("Aditya","Bose",30000,"a2",doj);
    	 emp.Entry();
    	 doj.displayDate();
    	 
 	     doj  = new Date(13,12,2017);
    	 emp = new Employee("Abhijit","Panda",22000,"b5",doj);
 		 emp.Entry();	
 		 doj.displayDate();
 		 
    emp.displaycount();
   }

}
