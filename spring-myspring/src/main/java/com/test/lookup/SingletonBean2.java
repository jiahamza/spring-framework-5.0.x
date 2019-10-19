package com.test.lookup;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 有侵入性，不推荐
 */
//@Component
public class SingletonBean2 implements ApplicationContextAware {
	private ApplicationContext applicationContext;

    public void print() {
        PrototypeBean bean = (PrototypeBean) applicationContext.getBean("prototypeBean");
        System.out.println("Bean SingletonBean's HashCode : "+bean.hashCode());
        bean.say();
    }

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}