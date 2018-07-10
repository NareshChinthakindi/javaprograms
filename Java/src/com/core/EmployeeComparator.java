/**
 * 
 */
package com.core;

import java.util.Comparator;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee current, Employee newEmployee) {
		return current.getFirstName().compareTo(newEmployee.getFirstName());
	}

}
