/**
 * 
 */
package com.designpattern.decorator;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class DecoratorDesignPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Pizza newPizza = new TomatoSauce(new Mozarilla(new PlainPizza()));
		
		System.out.println(newPizza.getDescription());
		
		System.out.println(newPizza.getCost());
	}

}
