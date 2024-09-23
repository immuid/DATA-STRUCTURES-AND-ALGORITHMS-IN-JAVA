package com.nptel.dsa.module1.lecture3.basics_of_generic_classes;

/**
	class GenericArrayClass {
	// Declaring a generic array
	// Constructor to load the array. 
	// Method to print the array elements
	// Method to reverse the array elements
	}
	class MainClass {
	//This class utilize the class GenericArrayClass to manipulate data of any type.
	}
*/

public class GenericArray<T> {
    // Declaring an array, which should store any type T of data
    T[] a;

    // Define a constructor
    public GenericArray(T[] a) {
        this.a = a;
    }

    // To return the element stored in the i-th place in the array
    T getData(int i) {
        return a[i];
    }

    // A generic method to print the elements in array b
    void printData() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // Print a new line
    }

    // A method to reverse the array elements
    void reverseArray() {
        int j = a.length - 1;
        for (int i = 0; i < j; i++) {
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }

    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericIntArray = new GenericArray<>(intArray);
        genericIntArray.printData();
        genericIntArray.reverseArray();
        genericIntArray.printData();

        // Example usage with String array
        String[] strArray = {"A", "B", "C", "D", "E"};
        GenericArray<String> genericStrArray = new GenericArray<>(strArray);
        genericStrArray.printData();
        genericStrArray.reverseArray();
        genericStrArray.printData();
    }
}
