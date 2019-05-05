package com.qinglanmei.spring.IOC;

/**
 * @program: springHandle
 * @description: spring 第一个程序
 * @author: qinglanmei
 * @create: 2019-04-30 16:05
 **/
public class Helloworld {


    private String message;
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//        System.out.println("输出为："+message);
//    }

    /**
     * Spring Boot生命周期
     */
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
