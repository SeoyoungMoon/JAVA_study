package ch03;

/*
 * 2023.09.01
 * 문서영 실습
 * Day2
 * */

public class BinaryTest {

	public static void main(String[] args) {

		int num = 10;    //그냥 아라비아 숫자
		int bNum = 0b1010;  //0b가 먼저 나오는 경우는 2진수
		int oNum = 012;  //0가 먼저 나오는 경우는 8진수
		int xNum = 0XA;  //0x가 먼저 나오는 경우는 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		
		int cNum = 0b01000001;  //65
		System.out.println(cNum);
		System.out.println((char)cNum);
		
	}

}
