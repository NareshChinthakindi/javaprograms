/**
 * 
 */
package com.designpattern.decorator;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class PlainPizza implements Pizza {

	
	@Override
	public String getDescription() {
		return "Plain Pizza";
	}

	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 20;
	}

}
