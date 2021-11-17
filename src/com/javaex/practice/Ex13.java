package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		int x = sc.nextInt();
		
		double a = (x*x*x)-(9*x)+2;
		double b = (7*x)+2;
		
		if(x<=0) {
			System.out.println("계산 결과는 "+a+" 입니다.");
		}else {
			System.out.println("계산 결과는 "+b+" 입니다.");
		}
		
		sc.close();

	}

}
