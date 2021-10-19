package main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Computer;

public class Main {

	public static ApplicationContext context = null;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Computer computer = context.getBean("computer", Computer.class);
		System.out.println(computer);
	}
}
