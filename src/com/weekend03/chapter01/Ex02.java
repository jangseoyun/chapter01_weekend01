package com.weekend03.chapter01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	//02. 중첩 반복문
		
		Scanner sc = new Scanner (System.in);
	
			int input = sc.nextInt();
			
			
			for(int y = 1; y<=input; y++) {
				for(int x = 1; x<=input; x++) {
					System.out.print("*");
				}
				System.out.println();
			}

		sc.close();
	
	}

}
