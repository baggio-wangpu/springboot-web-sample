package com.example.demo.lifecircle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
    Used for learn bean life circle
 */
public class Person implements BeanNameAware, DisposableBean, InitializingBean {

    private String name;

    public Person() {
        System.out.println("Constructor of person bean is invoked!");
    }

    public String getName() {
        System.out.println("Get name field as: " + name);
        return name;
    }
    public void setName(String name) {
        System.out.println("Set name field as: " + name);
        this.name = name;
    }

    //Bean initialization code
    @Override
    public void afterPropertiesSet() {
        System.out.println("Initializing method of person bean is invoked!");
    }

    //Bean destruction code
    @Override
    public void destroy() {
        System.out.println("Destroy method of person bean is invoked!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.printf("Set bean's name as: %s%n", name);
    }
}
