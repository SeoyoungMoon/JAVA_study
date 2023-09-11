package homework;

import java.util.Scanner;

/*
 * 2023.09.11
 * 문서영 실습
 * chapter2 연습문제 풀기 < 조건문과 반복문을 활용하여 다이아몬드를 출력하기 >
 * Day8
 * */

public class DiamondPatternTest {

	public static void main(String[] args) {

		int p;
		int n;

		for(p=1; p<8; p++) {
			for(n=1; n<4; n++) {
				//System.out.println( "지금 n은 3까지" );
			}
			for(n=4; n<8; n++) {
				//System.out.println( "지금 n은 4부터 7까지" );
			}
		}

		//----------------------------------여기까진 내가 하다가 포기한 부분---------------------------------------
		//----------------------------------챗GPT보면서 따라하기 START!!!---------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("다이아몬드의 높이를 입력하세요: ");
		int height = scanner.nextInt();

		int i;
		int j;
		int k;
		//다이아몬드의 상단 부분 출력
		for (i = 1; i <= height; i++) {
			for (j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//다이아몬드의 하단 부분 출력
		for (i = height - 1; i >= 1; i--) {
			for (j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i -1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


