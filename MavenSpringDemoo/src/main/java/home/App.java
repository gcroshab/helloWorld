package home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    /**
     * Hello World
     *
     */


    public static void main(String[] args)
    {
        //BeanFactory -- is for simple application
       // ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       // applicationContext is an interface.
        Vehicle obj = (Vehicle)context.getBean("vehicle");
        obj.drive();
    }
}
