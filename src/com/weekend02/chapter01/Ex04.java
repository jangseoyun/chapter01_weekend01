package com.weekend02.chapter01;

import java.util.Scanner;
//배우지 않음
public class Ex04 {

	public static void main(String[] args) {
	//04. 단순 반복문 알파벳 출력
		//알파벳 오름차순 정렬 배우지 않음
		
		Scanner sc = new Scanner(System.in);
		
			char input1 = 'a';
			char input2 = 'b';
			
			if(input1>input2) {
				for(int i = input2; input2<=input1; i++ ) {
					System.out.println(i+" ");
				}
			}else {
				for(int ii = input1; input1<=input2; ii++) {
					System.out.println(ii+" ");
				}
			}

		
		sc.close();

	}

}
