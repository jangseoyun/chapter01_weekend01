package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex08 {
//★
	public static void main(String[] args) {
	//08. if else 문제
		//1의 자릿수 구하기 : 10을 나누어 나오는 나머지 값을 구하면 나옴 num%10
		//10의 자릿수 구하기 : 100을 나누어 나오는 나머지 값 num%100
		//1의 자릿수 한자리 구하기 : (num%10)
		//10의 자릿수 한자리 구하기 : (num%100)/10
		//100의 자릿수 한자리 : (num%1000)/100
		//1000의 자릿수 한자리 : (num%10000)/1000
		
		Scanner sc = new Scanner(System.in);	
		
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			int sum = (year+month+day%1000)/100;
			
			if(sum%2==0) {
				System.out.println("대박");
			}else {
				System.out.println("그럭저럭");
			}
				
		
		sc.close();

	}

}
