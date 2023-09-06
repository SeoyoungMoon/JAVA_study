package ch05;

/*
 * 2023.09.01
 * 문서영 실습
 * chapter1 5강
 * Day2
 * */

public class IntVariableTest {

	public static void main(String[] args) {

		byte bs = -128;  //-128부터 127까지 가능

		System.out.println(bs);
		
		long iVal = 12345678900L;  //int의 범위를 넘어서서 오류가 나는거야.  그래서 l을 붙여주고 long으로 타입을 바꿔줬어.
		
		System.out.println(iVal);
	}

}
