package com.di.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.di.data.DataSource;
import com.di.data.DataSourceNew;

@Configuration
//@PropertySource("classpath:dataSource.properties")
//@PropertySource({"classpath:dataSource.properties","classpath:dataSourceNew.properties"})
@PropertySources({
		@PropertySource("classpath:dataSource.properties"),
		@PropertySource("classpath:dataSourceNew.properties")   //=>Another way to add multiple properties file
})
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
	
	@Value("${data.new.username}") 
	private String userNew;
	
	@Value("${data.new.password}")
	private String passwordNew;
	
	@Value("${data.new.dburl}")
	private String urlNew;
	
	@Bean
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setUsername(user);
		ds.setPassword(password);
		ds.setUrl(url);
		
		System.out.println("Environemnt Variable DEMO set to :" + env.getProperty("DEMO"));
		return ds;
	}
	
	@Bean
	public DataSourceNew dataSourceNew() {
		DataSourceNew ds = new DataSourceNew();
		ds.setUsername(userNew);
		ds.setPassword(passwordNew);
		ds.setUrl(urlNew);
		
		return ds;
	}
	

}
