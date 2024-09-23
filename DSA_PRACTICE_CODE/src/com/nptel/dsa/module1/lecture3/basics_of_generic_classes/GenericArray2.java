package com.nptel.dsa.module1.lecture3.basics_of_generic_classes;

/**
class GenericArray<T> {
//Declaring an array, which should store any type T of data
	T a[];

	GenericArray(T x) { // Define a constructor
		a = x;
	}

	T getData(int i) { // To return the element stored in the i-th place in the array
		return a[i];
	}
	
	void static printData (T b) { // A generic method to print the elements in array b
for(int i = 0; i <
b.length(); i ++)
System.out.print(b.getData(i) + “ “); // Print the i-th element in b
System.out.println(); // Print a new line
}
*/

class GenericArray2<T> {
//	T a[];

//	GenericArray2(T x) { // Define a constructor
//		T a = x;
//	}
//
//	T getData(int i) { // To return the element stored in the i-th place in the array
//		return a[i];
//	}

	public static <T> void printData(T[] b) { // A generic method to print the elements in array b
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " "); // Print the i-th element in b
		}
		System.out.println(); // Print a new line
	}
	 // A method to reverse the array elements
	public static <T> void reverseArray(T[] b) {
        int j = b.length - 1;
        for (int i = 0; i < j; i++) {
            T temp = b[i];
            b[i] = b[j];
            b[j] = temp;
            j--;
        }
    }
	public static void main(String[] args) {
	    Integer[] intArray = {1, 2, 3, 4, 5};
	    String[] strArray = {"A", "B", "C", "D", "E"};
	    
	    printData(intArray); // prints 1 2 3 4 5 
	    printData(strArray); // prints A B C D E
	    
	    reverseArray(intArray);
	    reverseArray(strArray);
	    printData(intArray); 
	    printData(strArray);
	}

}
