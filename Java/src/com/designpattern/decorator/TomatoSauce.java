/**
 * 
 */
package com.designpattern.decorator;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see com.designpattern.decorator.Pizza#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.tempPizza.getDescription() + ", Tamato Sauce";
	}

	/* (non-Javadoc)
	 * @see com.designpattern.decorator.Pizza#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.tempPizza.getCost()+.2;
	}


}
