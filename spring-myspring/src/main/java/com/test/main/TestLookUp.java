package com.test.main;

import com.test.app.Appconfig;
import com.test.lookup.SingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLookUp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
        SingletonBean singletonBean = (SingletonBean) ac.getBean("singletonBean");
        SingletonBean singletonBean2 = (SingletonBean) ac.getBean("singletonBean");
        singletonBean.print();
        singletonBean2.print();
    }
}
