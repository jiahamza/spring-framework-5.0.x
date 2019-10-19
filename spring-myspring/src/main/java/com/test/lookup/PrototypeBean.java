package com.test.lookup;

//@Component
//@Scope("prototype")
public class PrototypeBean {
    private String name;

    public PrototypeBean() {
    }

    public PrototypeBean(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("say something...");
    }
}