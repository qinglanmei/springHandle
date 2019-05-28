package com.qinglanmei.spring.learn.DI;

/**
 * @Author: qinglanmei
 * @Description:
 * @Date: 19:49 2019/5/28
 */
public class MutilArgsTest {
    private String name;
    private String age;
    private String isMarry;

    public MutilArgsTest(String name,int age,boolean isMarry){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("isMarry:"+isMarry);
    }
}
