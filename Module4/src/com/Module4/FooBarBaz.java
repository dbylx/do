package com.Module4;

public class FooBarBaz {
	public static void main(String []args) {
		int number;                //create a iteration variable:number
		for(number=1;number<=50;number++) {//create a for loop from one to fifty
			System.out.print(number);
			if(number%3==0) {               //if one number is multiple of three,print foo
				System.out.print(" foo");				
			}
			if(number%5==0) {
				System.out.print(" bar");//if one number is multiple of five,print bar
			}
			if(number%7==0) {
				System.out.print(" baz");//if one number is multiple of seven,print baz
			}
			System.out.println();//print a newline character
		}
	}
}
