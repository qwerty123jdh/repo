package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l= new ArrayList();
		l.add("ABC");
		l.add("XY");
		l.add("C");
		l.add("LMN45");
		l.add("ABC65");
		System.out.println(l);
		
		l.forEach(System.out::println);
		
		System.out.println("testing");
		
		l.stream().filter(data -> {return data.length()>=3;}).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
