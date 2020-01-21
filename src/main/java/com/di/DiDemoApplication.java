package com.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.di.controllers.ConstructorInjectionController;
import com.di.controllers.DiController;
import com.di.controllers.PropertyInjectorController;
import com.di.controllers.SetterInjectionController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		DiController di = (DiController)ctx.getBean("diController");
		
		System.out.println(di.sayHello());
		System.out.println(ctx.getBean(PropertyInjectorController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
		
		ctx.close();
	}

}
