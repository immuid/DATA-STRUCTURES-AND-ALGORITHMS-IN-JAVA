package com.nptel.dsa.module1.lecture3.basics_of_generic_classes;

/**
class SpecificArrayInt {
	// Declaring an array of integer values
	// Constructor to load the array.
	// Method to print the array elements.
	// Method to reverse the array elements.
	}
	class MainClassInt {
	// This class utilize the class SpecificArrayInt to
	//manipulate some integer data 
	}
*/

public class SpecificArrayInt {
	int [] a;
	public SpecificArrayInt(int a[]) {
		this.a=a;
//		printInt();
		System.out.println("INT");
	}
	void printInt() {
		for(int x:a) {
			System.out.print(x);
		}
		System.out.println();
	}
	void reverseInt() {
		int j=a.length-1;
		for(int i=0;i<j;i++) {
			int temp;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
//		printInt();
	}
	public static void main(String[] args) {
		int z[]= {9,4,4,4,4,6,2,8,7,3};
		SpecificArrayInt spi=new  SpecificArrayInt(z);
		spi.printInt();
		spi.reverseInt();
		spi.printInt();
	}
}