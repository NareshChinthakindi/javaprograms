/**
 * 
 */
package com.core;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class EmployeeComprable implements Comparable<EmployeeComprable>{

	
	
	
	public EmployeeComprable(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private String firstName;


	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;
	
	
	
	@Override
	public int compareTo(EmployeeComprable emp) {
		return this.getFirstName().compareTo(emp.getFirstName());
	}



	@Override
	public String toString() {
		return "EmployeeComprable [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	

}
