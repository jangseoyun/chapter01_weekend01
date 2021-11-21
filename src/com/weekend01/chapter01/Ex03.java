package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	//03. if~else문제
		
		Scanner sc = new Scanner(System.in);
		
			int input = sc.nextInt();
			
			if(input>=30 && input<=40 || input>=60 && input<=70) {
				System.out.println("win");
			}else {
				System.out.println("lose");
			}

		
		sc.close();

	}

}
