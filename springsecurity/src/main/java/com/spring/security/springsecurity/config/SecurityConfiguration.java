/**
 * 
 */
package com.spring.security.springsecurity.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	protected void configure(HttpSecurity http) throws Exception {

		http
			.authorizeRequests()
				.anyRequest()//.authenticated()
				//.and()
			//.formLogin()
				.permitAll()
			.and()
			.httpBasic();
		
		http.csrf().disable();
	}

}
