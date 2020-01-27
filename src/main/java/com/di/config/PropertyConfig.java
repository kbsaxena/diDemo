package com.di.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.di.data.DataSource;

@Configuration
@PropertySource("classpath:dataSource.properties")
public class PropertyConfig {
	
	/*
	 * If setting environment variable then we add - ALL CAPS and replace . by _    => DATA_USERNAME.
	 * Environment value will always override the current value.
	 * 2 ways to set environment variables. 
	 * 1.By Eclipse->Run Configuration->Environment->Add
	 * 2.By using Environment class
	*/
	@Autowired
	Environment env;
	
	@Value("${data.username}") 
	private String user;
	
	@Value("${data.password}")
	private String password;
	
	@Value("${data.dburl}")
	private String url;
	
	@Bean
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setUsername(user);
		ds.setPassword(password);
		ds.setUrl(url);
		
		System.out.println("Environemnt Variable DEMO set to :" + env.getProperty("DEMO"));
		return ds;
	}
	

}
