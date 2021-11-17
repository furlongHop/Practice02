package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		
		double x =sc.nextDouble();
		
		double ax = x*0.09;
		double bx = (1000*0.09)+0.18*(x-1000);
		double cx = (1000*0.09)+(3000*0.18)+0.27*(x-4000);
		double dx = (1000*0.09)+(3000*0.18)+(4000*0.27)+0.36*(x-8000);
		
		if(0<=x && x<=1000) {
			System.out.println("소득세는 "+ax+" 입니다.");
		}else if(1000<x && x<=4000) {
			System.out.println("소득세는 "+bx+" 입니다.");
		}else if(4000<x && x<=8000) {
			System.out.println("소득세는 "+cx+" 입니다.");
		}else if(8000<x) {
			System.out.println("소득세는 "+dx+" 입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();

		
	}

}
