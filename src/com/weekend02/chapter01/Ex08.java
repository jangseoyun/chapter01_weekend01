package com.weekend02.chapter01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	//08. 단순 반복문
		
		Scanner sc = new Scanner(System.in);
		
			int input = sc.nextInt();
			
			int sum = 0;
			
			for(int i = 1; i<=input; i++) {
				sum = sum+i;
			}
				System.out.println(sum);

		sc.close();

	}

}
