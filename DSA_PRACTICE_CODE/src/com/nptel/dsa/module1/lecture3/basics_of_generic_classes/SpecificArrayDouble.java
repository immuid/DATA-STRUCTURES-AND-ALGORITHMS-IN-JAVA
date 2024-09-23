package com.nptel.dsa.module1.lecture3.basics_of_generic_classes;

/**
class SpecificArrayDouble {
	// Declaring an array of Double values
	// Constructor to load the array.
	// Method to print the array elements.
	// Method to reverse the array elements.
	}
	class MainClassInt {
	// This class utilize the class SpecificArrayInt to
	//manipulate some integer data 
	}
*/

public class SpecificArrayDouble {
	double [] b;
	public SpecificArrayDouble(double b[]) {
		this.b=b;
//		printDouble();
	}
	void printDouble() {
		for(double x:b) {
			System.out.print(x);
		}
		System.out.println();
	}
	void reverseDouble() {
		int j=b.length-1;
		for(int i=0;i<j;i++) {
			double temp;
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;
			j--;
		}
//		printDouble();
	}
	public static void main(String[] args) {
		double z[]= {9.4,4.4,4.6,2.8,7.3};
		SpecificArrayDouble spi=new  SpecificArrayDouble(z);
		spi.printDouble();
		spi.reverseDouble();
		spi.printDouble();
	}
}