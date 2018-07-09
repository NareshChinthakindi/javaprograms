/**
 * 
 */
package com.spring.security.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Naresh_Chinthakindi
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
       
		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("naresh").roles("ADMIN").password(passwordEncoder().encode("naresh"));
	
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	protected void configure(HttpSecurity http) throws Exception {

		http
			.authorizeRequests()
				.anyRequest()//.authenticated()
				//.and()
			//.formLogin()
				.fullyAuthenticated()
			.and()
			.httpBasic();
		
		http.csrf().disable();
	}

}
