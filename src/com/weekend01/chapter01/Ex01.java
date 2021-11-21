package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
	//01. if~ else 문제
	
		Scanner sc = new Scanner(System.in);
		
			System.out.println("숫자를 입력하세요.");
			int input = sc.nextInt();
		
				if(input%2==0) {
					System.out.println("even");
				}else {
					System.out.println("odd");
				}

		sc.close();
				
	}
}
