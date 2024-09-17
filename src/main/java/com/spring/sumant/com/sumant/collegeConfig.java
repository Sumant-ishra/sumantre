package com.spring.sumant.com.sumant;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan
//public class collegeConfig {
//	@Bean
//	public Student getStudent() {
//		return new Student();
//	}
//	@Bean
//	public Faculty getFaculty() {
//		return new Faculty();
//	}
//
//}


//public interface collegeConfig {
//    void collegeInfo();
//}


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.sumant.com.sumant")
public class collegeConfig {
}

