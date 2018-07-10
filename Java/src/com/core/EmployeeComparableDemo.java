/**
 * 
 */
package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class EmployeeComparableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<EmployeeComprable> empList = new ArrayList();//Tree set will be default sorted.
		
		EmployeeComprable emp1 = new EmployeeComprable("Naresh", "Ch");
		empList.add(emp1);
		
		EmployeeComprable emp2 = new EmployeeComprable("Baju", "Ch");
		empList.add(emp2);
		
		Collections.sort(empList);
		empList.forEach( emp ->{
			System.out.println(emp.toString());
		});

	}

}
