package com.bridgelabz;


import java.util.Scanner;

public class FibonacciSeries {
	static void fibonacciNum(int n) {
		int a = 0;
		int b = 1;
		int c = 0;

		for(int i = 0; i<n; i++) {	
            System.out.print(a + " ");
            c = b + a;	//0 2 3
            a = b;		//1 1 2
            b = c;		//0 2 3

        }
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		 fibonacciNum(n);
	}

}
