package com.weekend02.chapter01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//10. 단순 반복문
		
		Scanner sc = new Scanner (System.in);
		
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			int sum = 0;
			
			for(int i = start; i<=end; i++ ) {
				if(i%3==0) {
					sum = sum + i;
				}
			}
			
			System.out.print(sum);

		sc.close();

	}

}
