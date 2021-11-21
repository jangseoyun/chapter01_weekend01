package com.weekend01.chapter01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	//10. if~else 문제
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("경기 시간: ");
			int time = sc.nextInt();
			System.out.print("점수: ");
			int score = sc.nextInt();
			
			int score_out = (90-time)/5; //추가골
			
			
			System.out.println((score_out+score+1));
		
		sc.close();

	}

}
