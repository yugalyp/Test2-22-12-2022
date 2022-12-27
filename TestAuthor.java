package com.exersises.pll;

import com.exersises.bll.Author;

public class TestAuthor {

	public static void main(String[] args) {
		Author a=new Author();
		System.out.println(a);
		
		Author a1=new Author("Ajay","Pandey"); 
		a1.setfirstName("Ajay");
		a1.setlastName("Pandey");
		System.out.println(a1.getfirstName());
		System.out.println(a1.getlastName());
		
		
		Author a2=new Author("Ajay","Pandey","Her Last Wish"); 
		
		System.out.println(a2);
		

	}

}

