package com.qinglanmei.spring.learn.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @program: springHandle
 * @description: ApplicationContext示例
 * @author: qinglanmei
 * @create: 2019-05-05 09:53
 **/
public class ApplicationContextMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("F:\\ideaWork\\rep\\springHandle\\src\\main\\resources\\Beans.xml");
//        Helloworld obj = (Helloworld) context.getBean("helloWorld");
//        obj.getMessage();

//        /**
//         * singleton 作用域 示例
//         */
//
//        Helloworld objA = (Helloworld) context.getBean("helloWorld");
//        objA.setMessage("I'm object A");
//        objA.getMessage();
//        Helloworld objB = (Helloworld) context.getBean("helloWorld");
//        objB.getMessage();

        /**
         * AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。它将确保正常关闭，并且调用相关的 destroy 方法
         */

//        Helloworld obj = (Helloworld) context.getBean("helloWorld");
//        obj.getMessage();
//        ((FileSystemXmlApplicationContext) context).registerShutdownHook();

        /**
         * SpringBean定义继承
         */

        HelloWorld2 objA = (HelloWorld2) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
