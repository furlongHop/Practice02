package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자:");
		int a = sc.nextInt();
		
		System.out.print("두 번째 숫자:");
		int b = sc.nextInt();
		
		int A = a%b;
		int B = b%a;
		
		
		if(a>b) {
			if(A==0) {
				System.out.println(b+" 는(은) "+a+" 의 약수입니다.");
			}else {
				System.out.println(b+" 는(은) "+a+" 의 약수가 아닙니다.");
			}
		}else if(a<b){
			if(B==0) {
				System.out.println(a+" 는(은) "+b+" 의 약수입니다.");
			}else {
				System.out.println(a+" 는(은) "+b+" 의 약수가 아닙니다.");
			}
		}else if(a==b) {
			System.out.println(a+" 는(은) "+b+" 의 약수입니다.");
		}
		
		sc.close();

	}

}
