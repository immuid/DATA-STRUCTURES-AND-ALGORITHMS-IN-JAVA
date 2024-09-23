package com.nptel.dsa.module1.lecture3.basics_of_generic_classes;

/**
 * Woking with user defined class type;
 */

public class Student {
	String name;
	double marks;

	public Student(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}
	
	@Override
		public String toString() {
		return "Name: " + name + ", Marks: " + marks;
		}
	public static void main(String[] args) {
		GenericClasses<Integer> iObj= new GenericClasses <Integer>(15);
		System.out.println(iObj.getObject());
		
		GenericClasses<String> sObj= new GenericClasses <String>("JAVA");
		System.out.println(sObj.getObject());
		
		Student student= new Student("IMRAN AHMED M", 99.9);
		
		GenericClasses<Student> tObj= new GenericClasses <Student>(student);
		System.out.println(tObj.getObject());
		
	}
}

class GenericClasses<T> {
	T obj;

	public GenericClasses(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}
}
