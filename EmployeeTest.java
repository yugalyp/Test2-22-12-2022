package com.exersises.pll;

import com.exersises.bll.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
			Employee emp1 = new Employee( 001, "Ajit", "Kohli", 350000.00 );
			Employee emp2 = new Employee( 002, "Prajwal", "Patil", 40000.00 );
			
			System.out.println(emp1.toString());
			System.out.println(emp2.toString());
			
			System.out.println();
			
			
			System.out.println( " raise salary" );
			System.out.println(emp1.toString());
			System.out.println(emp2.toString());
		}
	}


