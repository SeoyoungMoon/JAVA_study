package ch08;

/*
 * 2023.09.01
 * 문서영 실습
 * Day2
 * */

public class LocalVariableType {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3;	//한번 추론된 자료형은 다른 형으로 재선언x.
		System.out.println(str);
		
	}

}
