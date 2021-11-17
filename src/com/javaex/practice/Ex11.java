package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳: ");
		
		//Scanner는 문자열 입력만 가능, 문자 입력 기능은 없다.
		//Scanner.next()로 문자열을 받은 뒤, String.chartAt(0)으로 첫 번째 문자를 꺼내온다. 
		char A = sc.next().charAt(0);
		
		switch(A) {
			case 'a' :
				System.out.println("모음입니다.");
				break;
			case 'e' :
				System.out.println("모음입니다.");
				break;
			case 'i' :
				System.out.println("모음입니다.");
				break;
			case 'o' :
				System.out.println("모음입니다.");
				break;
			case 'u' :
				System.out.println("모음입니다.");
				break;
			default :
				System.out.println("자음입니다.");
				break;
		}
		
		sc.close();
		
		
	}
	
}
