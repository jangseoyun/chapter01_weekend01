package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			double input = sc.nextDouble();
			
			if(input>=50 && input<60) {
				System.out.println("win");
			}else {
				System.out.println("lose");
			}

		sc.close();

	}

}
