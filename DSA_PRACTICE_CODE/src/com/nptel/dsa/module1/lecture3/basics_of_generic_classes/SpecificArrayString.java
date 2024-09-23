package com.nptel.dsa.module1.lecture3.basics_of_generic_classes;

/**
class SpecificArrayString {
	// Declaring an array of Double values
	// Constructor to load the array.
	// Method to print the array elements.
	// Method to reverse the array elements.
	}
	class MainClassString {
	// This class utilize the class SpecificArrayInt to
	//manipulate some integer data 
	}
*/

public class SpecificArrayString {
	String [] str;
	public SpecificArrayString(String str[]) {
		this.str=str;
//		printDouble();
		System.out.println("String");
	}
	void printString() {
		for(String x:str) {
			System.out.print(x);
		}
		System.out.println();
	}
	void reverseString() {
		int j=str.length-1;
		for(int i=0;i<j;i++) {
			String temp;
			temp=str[i];
			str[i]=str[j];
			str[j]=temp;
			j--;
		}
//		printDouble();
	}
	public static void main(String[] args) {
		String str[]= {"944462873"};
		SpecificArrayString spi=new SpecificArrayString(str);
		spi.printString();
		spi.reverseString();
		spi.printString();
	}
}