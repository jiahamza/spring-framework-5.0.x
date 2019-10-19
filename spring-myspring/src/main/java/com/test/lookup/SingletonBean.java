package com.test.lookup;

import org.springframework.beans.factory.annotation.Lookup;

//@Component
public class SingletonBean {

    public void print() {
        PrototypeBean bean = methodInject("aaa");
        System.out.println("Bean SingletonBean's HashCode : "+bean.hashCode());
        bean.say();
    }
    // 也可以写成 @Lookup("prototypeBean") 来指定需要注入的bean
    @Lookup
    protected PrototypeBean methodInject(String name){
        return null;
    }
}