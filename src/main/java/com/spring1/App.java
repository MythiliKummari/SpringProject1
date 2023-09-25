package com.spring1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	   ApplicationContext context =new ClassPathXmlApplicationContext("spring.config.xml");
    	   StudentDtails student1=(StudentDtails)context.getBean("student1");
    	   System.out.println(student1);
    	    }

    }

