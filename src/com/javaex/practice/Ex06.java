package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해 주세요.");
		System.out.print("숫자 1: ");
		int a = sc.nextInt();
		
		System.out.print("숫자 2: ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("큰 수: "+a+" 작은 수: "+b+"입니다.");
		}else if(a==b) {
			System.out.println("큰 수: "+a+" 작은 수: "+b+"입니다.");
		}else {
			System.out.println("큰 수: "+b+" 작은 수: "+a+"입니다.");
		}
		
		
		sc.close();
		
	}

}
