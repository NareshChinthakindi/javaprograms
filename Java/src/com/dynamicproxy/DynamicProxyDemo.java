/**
 * 
 */
package com.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class DynamicProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CustomerService service = new CustomerBizService();
		
		AuditLogAdvice advice = new AuditLogAdvice(service);
		
		ClassLoader cl = DynamicProxyDemo.class.getClassLoader();
		
		CustomerService proxy = (CustomerService) Proxy.newProxyInstance(cl, new Class[] {CustomerService.class}, advice);

		proxy.saveCustomer();

	}

}
