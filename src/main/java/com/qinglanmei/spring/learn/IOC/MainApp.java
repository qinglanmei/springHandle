package com.qinglanmei.spring.learn.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springHandle
 * @description:
 * @author: qinglanmei
 * @create: 2019-04-30 16:06
 **/
public class MainApp {
    public static void main(String[] args) {
        /**
         * Spring BeanFactory容器
         */
        /*
        第一步是我们使用框架 API ClassPathXmlApplicationContext() 来创建应用程序的上下文。
        这个 API 加载 beans 的配置文件并最终基于所提供的 API，它处理创建并初始化所有的对象，即在配置文件中提到的 beans。
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        /*
        第二步是使用已创建的上下文的 getBean() 方法来获得所需的 bean。
        这个方法使用 bean 的 ID 返回一个最终可以转换为实际对象的通用对象。一旦有了对象，你就可以使用这个对象调用任何类的方法。
         */
        Helloworld hw =(Helloworld) context.getBean("helloWorld");
        /*
        你需要创建一个 Bean 的配置文件，该文件是一个 XML 文件，并且作为粘合 bean 的粘合剂即类。这个文件需要在 src 目录下创建
        通常开发人员保存该文件的名称为 Beans.xml 文件，当然你也可以设置成任何你喜欢的名称。
        但是你必须确保这个文件在 CLASSPATH 中是可用的，并在主应用程序中使用相同的名称，而在 MainApp.java 文件中创建应用程序的上下文。
        Beans.xml 用于给不同的 bean 分配唯一的 ID，并且控制不同值的对象的创建，而不会影响 Spring 的任何源文件。
        例如，使用下面的文件，你可以为 “message” 变量传递任何值，因此你就可以输出信息的不同值，而不会影响的 HelloWorld.java和MainApp.java 文件

        当 Spring 应用程序被加载到内存中时，框架利用了上面的配置文件来创建所有已经定义的 beans，并且按照标签的定义为它们分配一个唯一的 ID。
        你可以使用标签来传递在创建对象时使用不同变量的值。
         */
        hw.getMessage();



    }
}
