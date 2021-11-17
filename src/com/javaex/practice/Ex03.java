package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		//작은 따욤표: \'a\', 큰 따옴표: \"a\"
		if(age>20) {
			System.out.println("\"1번 그룹\"");
		}else {
			System.out.println("\'2번 그룹\'");
		}
		System.out.println("입니다.");
		
		sc.close();

		//sample) 15>2, 19>2, 20>2, 21>1, 100>1
		
	}
}
