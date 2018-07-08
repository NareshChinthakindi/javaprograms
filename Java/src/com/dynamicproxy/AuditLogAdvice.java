/**
 * 
 */
package com.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class AuditLogAdvice implements InvocationHandler{
	
	
	private Object target;
	public AuditLogAdvice(Object target) {

		 this.target = target;
	}

	@Override
	public Object invoke(Object proxyObject, Method method, Object[] args) throws Throwable {
		
		System.out.println("Before invoking actual object");
		Object result = method.invoke(target, args);
		return result;
	}

}
