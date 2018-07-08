/**
 * 
 */
package com.dynamicproxy;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class CustomerBizService implements CustomerService{

	@Override
	public String saveCustomer() {
		
		System.out.println("Inside CustomerBizService");
		
		return "Naresh";
	}

}
