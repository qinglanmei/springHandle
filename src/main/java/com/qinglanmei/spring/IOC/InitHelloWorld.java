package com.qinglanmei.spring.IOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * @program: springHandle
 * @description: BeanPostProcessor 使用
 * @author: qinglanmei
 * @create: 2019-05-05 13:52
 **/
public class InitHelloWorld implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before初始化："+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after初始化："+beanName);
        return bean;
    }
}
