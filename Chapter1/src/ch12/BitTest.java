package ch12;

/*
 * 2023.09.04
 * 문서영 실습
 * chapter1 12강
 * Day3
 * */

public class BitTest {

	public static void main(String[] args) {

		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2);	//겹치는 애들 00001111 해서 15
		System.out.println(num1 & num2);	//겹치는 애들이 없어서 00000000
		System.out.println(num1 ^ num2);	//서로 다른 경우에 1이라서 00001111이라 15
		System.out.println(~num1);			//반전된 수 출력
		
		System.out.println(num1 << 2);		//왼쪽으로 2비트 이동
		System.out.println(num1);			//num1은 여전히 5를 유지. 값을 바뀌게 하려면
		System.out.println(num1 <<= 2);		//이동하고 대입해줘야돼.
		System.out.println(num1);			//그럼 이제 num1의 값은 20으로 바뀌어. 

		
	}

}
