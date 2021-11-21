package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex07 {
//★
	public static void main(String[] args) {
	//07. if~else 문제
		//%10을 하면 1의 자리 숫자를 알 수 있다. 
		
		Scanner sc = new Scanner(System.in);
		
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			int output = (year-month)+day;
			
			if(output%10==0) {
				System.out.println("대박");
			}else {
				System.out.println("그럭저럭");
			}
		
		sc.close();

	}

}
