/**
 * 
 */
package com.spring.security.springsecurity.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naresh_Chinthakindi
 *
 */

@RestController
@RequestMapping("/rest")
public class HelloResource {
	
	
	
	@GetMapping(value = "/hello")
	public String helloWorld() {
		return "Hello";
	}

}
