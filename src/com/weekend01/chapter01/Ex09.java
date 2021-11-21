package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	//09. if ~else 문제
		
		Scanner sc = new Scanner(System.in);
		
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			int input3 = sc.nextInt();
			
			if(input1<=170 || input2<=170 || input3<=170) {
				System.out.println("CRASH");
			}else {
				System.out.println("PASS");
			}
		
		sc.close();

	}

}
