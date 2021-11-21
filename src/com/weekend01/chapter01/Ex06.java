package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	//06 if~else 문제
		Scanner sc = new Scanner(System.in);
		
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			
			int sum = input1+input2;

			
				if(input1%2==0) {
					System.out.print("짝수+");
				}else {
					System.out.print("홀수+");
				}
		
				if(input2%2==0) {
					System.out.print("짝수=");
				}else {
					System.out.print("홀수=");
				}
				
				if(sum%2==0) {
					System.out.println("짝수");
				}else {
					System.out.println("홀수");
				}
				
		sc.close();

	}

}
