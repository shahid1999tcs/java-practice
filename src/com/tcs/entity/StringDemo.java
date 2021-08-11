package com.tcs.entity;

public class StringDemo {
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("TCS");
//		sb.append(", Mumbai");
//		System.out.println(sb);
//		String s1 = "TCS"; //Part of the string pool
//		String s2 = new String("TCS"); //Part of the heap
//		String s3 = s1 + s2; //Also part of the heap
//		System.out.println(s1 == s2);//Point to the same object when string literal is same
//		
		
		
	//}
	
	public static void main (String[] args) {
	    Object error = new Error();
	    Object runtimeException = new RuntimeException();
	    System.out.print((error instanceof Exception) + ",");
	    System.out.print(runtimeException instanceof Exception);
	}
}