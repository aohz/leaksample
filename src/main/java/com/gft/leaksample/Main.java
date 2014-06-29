package com.gft.leaksample;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Producer Consumer Leak Problem...");
		new ClassPathXmlApplicationContext("problem-context.xml");
		System.out.println("Main Class Ending...");
	}
}
