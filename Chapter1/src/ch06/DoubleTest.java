package ch06;

/*
 * 2023.09.01
 * 문서영 실습
 * chapter1 6강
 * Day2
 * */

public class DoubleTest {

	public static void main(String[] args) {

		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		double mynum = 1;		//부동 소수점 방식의 오류
		for( int i=0; i<10000; i++) {
			mynum = mynum + 0.1;
		}
		
		System.out.println(mynum);
	}

}
