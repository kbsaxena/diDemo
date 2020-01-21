package com.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
/*LifeCycle
Constructor -> setBeanName -> setBeanFactory -> setApplicationContext -> pp-beforeInit -> postContruct -> afterPropertiesSet -> 
             pp-afterInit -> beans impls -> preDestroy -> destroy
*/
public class BeanLifeCycle implements InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware, BeanFactoryAware{

	public BeanLifeCycle() {
		System.out.println("BeanLifeCycle......");
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
	
	@PostConstruct
	public void postContruct() {
		System.out.println("postContruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy");
	}
	
	public void beforeInit() {
		System.out.println("beforeInit");
	}
	
    public void afterInit() {
    	System.out.println("afterInit");
	}

}
