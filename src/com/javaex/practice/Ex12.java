package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String mark = sc.nextLine();
		
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		double plus = num1+num2;
		double minus = num1-num2;
		double multiply = num1*num2;
		double division = num1/num2;
		
		
		switch(mark) {
			case "+" : 
				System.out.println("결과는: "+plus);
				break;
			case "-" : 
				System.out.println("결과는: "+minus);
				break;
			case "*" : 
				System.out.println("결과는: "+multiply);
				break;
			case "/" :
				if(num2==0) {
					System.out.println("계산할 수 없습니다.");
				} else {
					System.out.println("결과는: "+division);
				}
				break;
			default :
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		

		
		sc.close();

	}

}
