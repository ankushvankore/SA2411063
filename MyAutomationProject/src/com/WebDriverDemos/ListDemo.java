package com.WebDriverDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListDemo {

	public static void main(String[] args) {
		/*List<String> students = new ArrayList<>();
		students.add("Purnima");
		students.add("Mohit");
		students.add("Vikas");
		
		System.out.println(students.get(0));
		
		for(String st : students)
			System.out.println(st);*/
		
		Random rnd = new Random();
		int i = rnd.nextInt(6);
		
		System.out.println(i);
	}

}
