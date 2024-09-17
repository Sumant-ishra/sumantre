package com.spring.sumant.com.sumant;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Laptop1 object=new HP();
//        obj.disp();
    //	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//        Laptop1 obj=(Laptop1)context.getBean("dell");
//        obj.disp();
        
//        Student obj=(Student)context.getBean("student");
//        obj.disp();
        
//        Subject obj=(Subject)context.getBean("subject");
//        System.out.println(obj);
   //     DELL d= (DELL)context.getBean("dell");
   //     d.disp();
//    	
//    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Faculty.class);
//    	Faculty obj = ((BeanFactory) context).getBean(Faculty.class);
//    	obj.Faculty_info();
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
    	Student obj = ((BeanFactory) context).getBean(Student.class);
    	obj.Student_info();
    }
}



