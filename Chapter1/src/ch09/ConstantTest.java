package ch09;

/*
 * 2023.09.04
 * 문서영 실습
 * Day3
 * */

public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 1024;	//변하지 않는 상수로 선언했기 때문에 초기값을 바꾸지 않는 한 재설정 x.
		final int MIN_NUM = 10;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 2048;  상수라서 변경 불가능
		
		
		
	}

}
