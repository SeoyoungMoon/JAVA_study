package ch09;

/*
 * 2023.09.04
 * 문서영 실습
 * chapter1 9강
 * Day3
 * */

public class TypeConversion {

	public static void main(String[] args) {

		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;	//int로 각각 변환 뒤 더한거라 1 + 0 을 한 셈이 돼
		int iNum2 = (int)(dNum + fNum);		//큰수와 작은수의 연산에는 작은수가 큰수로 형변환이 일어나서 더해지면 결과는 더블이 돼.
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int num = 1000;
		byte bNum = (byte)num;
		
		System.out.println(bNum);	//데이터 손실이 일어나고 전혀 다른 결과가 나오게 돼. 그래서 형변환할때 거꾸로 될때 자료손실을 주의해야돼
		
	}

}
