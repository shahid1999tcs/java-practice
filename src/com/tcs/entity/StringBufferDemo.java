package com.tcs.entity;

public class StringBufferDemo {
	public static void main(String[] args) {
		String literal = "Shahid";
		String newKeyWord = new String("SHahid"); //immutable
		StringBuilder sb = new StringBuilder("Shahid");//mutable , not thread safe
		StringBuffer sbf = new StringBuffer("Shahid");//mutable, thread safe
	}

}
