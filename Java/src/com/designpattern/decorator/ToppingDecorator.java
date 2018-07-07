/**
 * 
 */
package com.designpattern.decorator;

/**
 * @author Naresh_Chinthakindi
 *
 */
public abstract class ToppingDecorator implements Pizza {
	
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza) {

		 tempPizza = newPizza;
	}

	/* (non-Javadoc)
	 * @see com.designpattern.decorator.Pizza#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.tempPizza.getDescription();
	}

	/* (non-Javadoc)
	 * @see com.designpattern.decorator.Pizza#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.tempPizza.getCost();
	}

}
