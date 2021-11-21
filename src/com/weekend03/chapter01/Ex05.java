package com.weekend03.chapter01;

import java.util.Scanner;

public class Ex05 {
//★
	public static void main(String[] args) {
	//05. 중첩 반복문 역삼각형 출력
		Scanner sc = new Scanner (System.in);
		
			int input = sc.nextInt();
			
			for(int y = 0; y<input; y++) {
				for(int x = 1; x<=input; x++) {
					if(y<x) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		
		
		sc.close();

	}

}
