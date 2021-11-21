package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	//05 if~else 문제
		
		Scanner sc = new Scanner(System.in);
		
			int input = sc.nextInt();
			
			if(input==1 || input==3 || input==5 || input==7) {
				System.out.println("oh my god");
			}else {
				System.out.println("enjoy");
			}

			/*알바가는 날은 모두 홀수이다. 따라서 
			if(input%2==1) {
				System.out.println("oh my god");
			}*/
		
		sc.close();
	}

}
