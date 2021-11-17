package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		int age = 15;
		
/*		//age가 0세 초과이고 18세 미만이면
		if(0 < age < 18) {
			System.out.println("청소년입니다.");
		}
*/
		
		//if의 변수 조건에는 연산자를 한 번에 두 개 쓸 수 없다. 식을 두 개 쓰는 방식으로 바꾸자.
		if(0<age && age<18) {
			System.out.println("청소년입니다.");
		}else {
			System.out.println("청소년이 아닙니다.");
		}

	}

}
