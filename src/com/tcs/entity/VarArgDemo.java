package com.tcs.entity;

public class VarArgDemo {
	public static void main(String[] args) {
		String[] subjects = { "MATH", "English" };
		Student student = new Student(subjects);
		System.out.println(student.subjects[0]);
		Student student1 = new Student("Science");
		System.out.println(student1.subjects[0]);
	}
}

class Student {
	String[] subjects;

//	 public Student(String[] subjects) { // Can pass only arrays
//		 this.subjects = subjects;
//	 }
	public Student(String... subjects) { // Varags. more flexible
		this.subjects = subjects;
	}
}