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
		
		
		String p = "+";
		String m = "-";
		String mp = "*";
		String d = "/";
		
		if(text.equals("mark")) {
		   System.out.println("결과는: "+plus);
	     }else if(mark==m) {
			System.out.println("결과는: "+minus);
	     }else if(mark==mp) {
			System.out.println("결과는: "+multiply);
	     }else if(mark==d) {
	    	  if(num2==0) {
			 	System.out.println("계산할 수 없습니다.");
			}
		     System.out.println("결과는: "+division);
	     }
	    
		
		sc.close();

	}

}
