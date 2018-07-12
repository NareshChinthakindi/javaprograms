/**
 * 
 */
package com.rohini.jpa.springjpahibernate.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Naresh_Chinthakindi
 *
 */
@RestController
@RequestMapping(name = "/rest/employee")
public class EmployeeRestController {
	
	
	
	@GetMapping(name = "/getAll")
	public String getHello() {
		
		return "Naresh";
	}

}
