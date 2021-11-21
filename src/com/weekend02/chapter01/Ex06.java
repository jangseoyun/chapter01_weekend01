package com.weekend02.chapter01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	//06. 단순 반복문 별출력
		
		Scanner sc = new Scanner (System.in);
		
			int input = sc.nextInt();
			
			for(int i = 1; i<=input; i++) {
				System.out.print("*");
			}

		sc.close();

	}

}
