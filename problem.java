package br.edu.uft.poo.a2024s2d0309;

import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A * B;
		
		System.out.println("PROD = " + PROD);
	}
}
