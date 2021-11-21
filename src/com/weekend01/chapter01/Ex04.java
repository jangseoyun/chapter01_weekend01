package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	//04. if~else 문제

		Scanner sc = new Scanner(System.in);
		
			int input = sc.nextInt();
			
			if(input>=50 && input<=70 || input%6==0) {
				System.out.println("win");
			}else {
				System.out.println("lose");
			}
		
		sc.close();
	}

}
