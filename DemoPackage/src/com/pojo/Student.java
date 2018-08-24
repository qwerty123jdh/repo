package com.pojo;

import java.util.Arrays;

public class Student {

		String name;
		int [] marks= new int[5];
		int rollNo;
		public Student() {
	}
		
		public Student(String name1, int [] marks1, int rollno) {
			name=name1;
					rollNo=rollno;
					marks=Arrays.copyOf(marks1, 5);
		}
		
		public void display() {
			
				System.out.println("Name:-"+name+"\t"+"rollno"+rollNo);
				for(int x:marks) {
					System.out.print(marks[x]+"\t");
			}
		}

}
