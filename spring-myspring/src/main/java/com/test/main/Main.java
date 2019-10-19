package com.test.main;

import com.test.app.Appconfig;
import com.test.dao.TestDao;
import com.test.postprocessor.TestBeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestDao.class);
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		//ApplicationContext ac2 = new ClassPathXmlApplicationContext("");
		//若想使用ac的register方法注册一个bean，则还需调用ac的refresh方法刷新才起作用，不然会报错:
		// AnnotationConfigApplicationContext@42d3bd8b has not been refreshed yet
		ac.register(Appconfig.class);
		ac.addBeanFactoryPostProcessor(new TestBeanDefinitionRegistryPostProcessor());
		ac.refresh();

		//ac.scan("com.test");
		//手动添加的TestBeanFactoryPostProcessor什么时候添加进去？
		//ac.refresh();
		TestDao testDao = ac.getBean(TestDao.class);
		testDao.query();
 
	}
}