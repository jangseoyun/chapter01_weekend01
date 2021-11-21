package com.weekend02.chapter01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	//07. 단순 반복문 
		
		Scanner sc = new Scanner(System.in);
		
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			for(int i = start; i<=end; i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}
			}

		sc.close();
	}

}
