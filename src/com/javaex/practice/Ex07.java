package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자: ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 숫자: ");
		int b = sc.nextInt();
		
		int A = a%b;
		int B = b%a;
		int a1 = a/b;
		int b1 = b/a;
				
		if(a>b) {
			System.out.println("몫: "+a1);
			System.out.println("나머지: "+A);
		}else if(a<b) {
			System.out.println("몫: "+b1);
			System.out.println("나머지: "+B);
		}else {
			System.out.println("몫: "+b1);
			System.out.println("나머지: "+0);
		}
		
		sc.close();

	}

}
