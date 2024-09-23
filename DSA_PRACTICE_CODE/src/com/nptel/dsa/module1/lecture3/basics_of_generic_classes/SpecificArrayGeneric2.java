package com.nptel.dsa.module1.lecture3.basics_of_generic_classes;

/**
class SpecificArrayGeneric {
	// Declaring an array of Double values
	// Constructor to load the array.
	// Method to print the array elements.
	// Method to reverse the array elements.
	}
	class MainClassGeneric {
	// This class utilize the class SpecificArrayInt to
	//manipulate some integer data 
	}
 * @param <T>
*/

public class SpecificArrayGeneric2<T> {
	T [] gen;
	public SpecificArrayGeneric2(T gen[]) {
		this.gen=gen;
//		printDouble();
		System.out.println("Generic");
	}
	void printGeneric() {
		for(T t:gen) {
			System.out.print(t);
		}
		System.out.println();
	}
	void reverseGeneric() {
		int j=gen.length-1;
		for(int i=0;i<j;i++) {
			T temp;
			temp=gen[i];
			gen[i]=gen[j];
			gen[j]=temp;
			j--;
		}
//		printDouble();
	}
	public static void main(String[] args) {
		Integer z[]= {9,4,4,4,4,6,2,8,7,3};
		Double d[]= {9.4,4.4,4.6,2.8,7.3};
		String str[]= {"944462873"};
		SpecificArrayGeneric2<Integer> spi =new SpecificArrayGeneric2<Integer>(z);
		spi.printGeneric();
		spi.reverseGeneric();
		spi.printGeneric();
		SpecificArrayGeneric2<Double> spi1 =new SpecificArrayGeneric2<Double>(d);
		spi1.printGeneric();
		spi1.reverseGeneric();
		spi1.printGeneric();
		SpecificArrayGeneric2<String> spi2 =new SpecificArrayGeneric2<String>(str);
		spi2.printGeneric();
		spi2.reverseGeneric();
		spi2.printGeneric();
	}
}