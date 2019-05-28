package com.qinglanmei.spring.learn.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qinglanmei
 * @Description:
 * @Date: 19:39 2019/5/28
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
//        TextEditor te = (TextEditor) context.getBean("textEditor");
//        te.spellCheck();
        MutilArgsTest  mutilArgsTest = (MutilArgsTest) context.getBean("mutilArgsTest");
    }
}
