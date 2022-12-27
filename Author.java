package com.exersises.bll;

public class Author {
	String firstName;
	String lastName;
	String bookName;
	
	
		public Author() {
			
		}
		
	public Author(String f,String l) {
		this.firstName= f;
		this.lastName=l;
	}
	
	public Author(String f,String l,String b) {
		this.firstName= f;
		this.lastName=l;
		this.bookName=b;
	}
	
	public  String getfirstName( ) {
		return firstName;
	}
	public void setfirstName(String lastName) {
		this.firstName=firstName;
	}
	public  String getlastName( ) {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}//string to display author details
	public String toString() {
		String Str="FirstName: "+" "+getfirstName()+ " "+"\nLastName: "+" "+getlastName()+ "\nBookName: " + getBookName();
		return Str;
		
	}

}
