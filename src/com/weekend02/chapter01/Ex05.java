package com.weekend02.chapter01;

import java.util.Scanner;

public class Ex05 {
//모르겠음....
	public static void main(String[] args) {
	//05. 단순 반복문 
		Scanner sc = new Scanner(System.in);
		
			double input1 = sc.nextDouble();
			double input2 = sc.nextDouble();
			
			if(input1>input2) {
				for(double a = input2; input2<=input1; a+=0.01) {
					System.out.println((double)a+" ");
				}
			}else {
				for(double b = input1; input1<=input2; b+=0.01) {
					System.out.println((double)b+" ");
				}
			}

		
		sc.close();
	}

}
