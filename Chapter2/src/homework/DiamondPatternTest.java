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

		int m;
		int h;
		int u;
		//다이아몬드의 상단 부분 출력
		for (m = 1; m <= height; m++) {
			for (h = 1; h <= height - m; h++) {
				System.out.print(" ");
			}
			for (u = 1; u <= 2 * m - 1; u++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//다이아몬드의 하단 부분 출력
		for (m = height - 1; m >= 1; m--) {
			for (h = 1; h <= height - m; h++) {
				System.out.print(" ");
			}
			for (u = 1; u <= 2 * m -1; u++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//----------------------------------찬뿡이가 만든 다이아몬드 START!!!---------------------------------------
		
		System.out.println("홀수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		
		int num = Integer.parseInt(number);
		
		int width = 1;
		for(int i=1; i<num; i++) {
			width += 2;
		}
		
		String text = "";
		int length = width;
		for(int i=0; i<num*2-1; i++) {
			 
			String space = "";
			String stars ="";
			int spaceCnt = length/2;
			for(int j=0;j<spaceCnt;j++) {
				space += " ";
			};
			
			for(int k=0;k<width-(spaceCnt*2); k++) {
				stars += "*";
			}
			if(i>=num-1) {
				length+=2;
			}else {
				length-=2;				
			}
			
			text += space + stars + space +"\n";
		}
		
		System.out.println(text);
				

	}

}


