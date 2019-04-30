package com.qinglanmei.spring;

/**
 * @program: springHandle
 * @description: spring 第一个程序
 * @author: qinglanmei
 * @create: 2019-04-30 16:05
 **/
public class Helloworld {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("输出为："+message);
    }
}
