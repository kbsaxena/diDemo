package com.di.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.di.data.DataSource;

@Configuration
@PropertySource("classpath:dataSource.properties")
public class PropertyConfig {
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
		return ds;
	}
	

}
