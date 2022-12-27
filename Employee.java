package com.exersises.bll;

public class Employee {
	private int id;
	private String firstName; 
	private String lastName; 
	private double salary; 
		
		
		public Employee( int id,String firstName, String lastName, double salary)
		{
			this.id=id;
			this.firstName = firstName; 
			this.lastName = lastName; 
			this.salary = salary; 
			
			
			if (this.salary < 0.0)
				this.salary = 0.0;
		} 
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public void setFirstName (String fname)
		{
			firstName = fname;	}
		
		
		public String getFirstName ()
		{
			return firstName;
		} 
		
		public void setLastName (String lname)
		{
			lastName = lname;	
		}
		
		
		public String getLastName ()
		{
			return lastName;
		} 
		
		
		public void setSalary (double salary)
		{
			salary = salary;	}
		
		
		
		public double getSalary ()
		{
			return salary;
		} 
		
		public double getAnnualSalary()
		{
			double AnnualSalary = salary * 12;
			return AnnualSalary;
		} 
		public double getRaiseSalary()
		{
			double raise =  salary * 0.1 ;
			double raiseSalary = ( salary + raise ) * 12;
			return raiseSalary;
		} 
		public String toString() {
			String str= "Employe id: " +getId()+ "\nName: "+getFirstName() + getLastName()+"\nSalary: "+getSalary();
			return str;
			
		}
		
	} 