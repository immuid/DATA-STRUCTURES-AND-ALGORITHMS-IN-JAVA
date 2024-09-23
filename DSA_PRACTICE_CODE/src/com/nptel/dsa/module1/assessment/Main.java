package com.nptel.dsa.module1.assessment;

public class Main {

	public static int f(int x, int y) {
		return (x > y) ? y : x;
	}

	public static void main(String[] args) {

		String str1 = "NPTEL";
		String str2 = "java";
		int a = 20;
		int b = 24;
		System.out.println(str1 + a + b); // Statement 1
		System.out.println(a + b + str2); // Statement 2

		int f = 0, g = 1;
		for (int i = 0; i <= 5; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}

		int x = 5;
		x *= (2 + 8);
		System.out.println(x);

		long n = 00020;

		// Calculate and display the sum of the digits
		System.out.print("The sum of the digits is: " + sumDigits(n));
	}

	public static long sumDigits(long n) {
		long sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;

	}

}
