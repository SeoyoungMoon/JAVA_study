package ch07;

/*
 * 2023.09.01
 * 문서영 실습
 * Day2
 * */

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A';	//""는 문자열인 String에서 사용
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		char ch3 = '한';
		char ch4 = '\uAC00';		//유니코드 상으로 총 2바이트 크기로 한글 표현 가능
		
		System.out.println(ch3);
		System.out.println(ch4);
		
	}

}
