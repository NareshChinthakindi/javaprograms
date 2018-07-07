/**
 * 
 */
package com.designpattern.decorator;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class Mozarilla extends ToppingDecorator{

	public Mozarilla(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
	}
	
	
	/* (non-Javadoc)
	 * @see com.designpattern.decorator.Pizza#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.tempPizza.getDescription() + ", Mozarilla";
	}

	/* (non-Javadoc)
	 * @see com.designpattern.decorator.Pizza#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.tempPizza.getCost() + .5;
	}

}
