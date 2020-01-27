package com.di.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.di.data.BookSource;

@Configuration
public class YmlConfig {

	@Value("${bookname}")
	private String bookName;
	
	@Value("${authorname}")
	private String authorName;
	
	@Bean
	public BookSource bookSource() {
		BookSource bs = new BookSource();
		bs.setBookName(bookName);
		bs.setAuthorName(authorName);
		
		return bs;
	}
}
