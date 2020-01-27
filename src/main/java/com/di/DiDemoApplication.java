package com.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.di.controllers.ConstructorInjectionController;
import com.di.controllers.DiController;
import com.di.controllers.PropertyInjectorController;
import com.di.controllers.SetterInjectionController;
import com.di.data.BookSource;
import com.di.data.DataSource;
import com.di.data.DataSourceNew;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		DiController di = (DiController)ctx.getBean("diController");
		
		System.out.println(di.sayHello());
		System.out.println(ctx.getBean(PropertyInjectorController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
		
		DataSource ds = (DataSource)ctx.getBean(DataSource.class);
		
		System.out.println("Username is :" + ds.getUsername());
		System.out.println("Password is :" + ds.getPassword());
		System.out.println("Url is :" + ds.getUrl());
		
		DataSourceNew dsn = (DataSourceNew)ctx.getBean(DataSourceNew.class);
		System.out.println("New Property Username is :" + dsn.getUsername());
		
		BookSource bs = (BookSource)ctx.getBean(BookSource.class);
		System.out.println("Book :" + bs.getBookName() + " is written by " + bs.getAuthorName());
		
		ctx.close();
	}

}
