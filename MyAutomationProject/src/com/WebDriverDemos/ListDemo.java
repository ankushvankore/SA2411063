package com.WebDriverDemos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> students = new ArrayList<>();
		students.add("Purnima");
		students.add("Mohit");
		students.add("Vikas");
		
		System.out.println(students.get(0));
		
		for(String st : students)
			System.out.println(st);
	}

}
