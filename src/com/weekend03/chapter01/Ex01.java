package com.weekend03.chapter01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	//01. 중첩 반복문 구구단
		
		Scanner sc = new Scanner(System.in);
		
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			for(int dan = start; dan<=end; dan++) {
				for(int i = 1; i<=9; i++) {
					System.out.println(dan+"*"+i+"="+dan*i);
				}
			}
	
		sc.close();		
	}

}
