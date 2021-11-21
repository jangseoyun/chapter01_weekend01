package com.weekend02.chapter01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	//03. 단순 반복문 
		
		Scanner sc = new Scanner(System.in);
		
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		if(input1>input2){
			for(int a = input2; a<=input1; a++) {
				System.out.print(a+" ");
			}
		}else {
			for(int b = input1; b<=input2; b++) {
				System.out.print(b+" ");
			}
		}

		sc.close();

	}

}
