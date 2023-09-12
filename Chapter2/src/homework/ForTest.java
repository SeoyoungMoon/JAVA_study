package homework;

/*
 * 2023.09.11
 * 문서영 실습
 * chapter2 연습문제 풀기 < 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보기 >
 * Day8
 * */

public class ForTest {

	public static void main(String[] args) {

		int dan;	//단 수
		int num;	//곱할 수

		for(dan=2; dan<=9; dan++) {
			
			for(num=1; num<=9; num++) {
				if(dan < num) {
					System.out.println("이번 " + dan + "단은 " + (num-1) + "까지 곱한값까지만 출력됩니다");
					//num-1이라고 쓰지 않으면 숫자가 하나 크게 나오는데 그 이유를 모르겠어... 
					break;
				}
				System.out.println(dan + " X " + num + " = " + dan*num);
			}
			System.out.println();
		}

		//-------------------------------------------------------------------------------------------------
		
		System.out.println("-----------찬뿡이의 도움을 받아서 새로 작성-----------\n");
		
		for(dan=2; dan<=9; dan++) {
			System.out.println("이번 " + dan + "단은 " + (dan) + "까지 곱한값까지만 출력됩니다");

			for(num=1; num<=9; num++) {		
				System.out.println(dan + " X " + num + " = " + dan*num);
				if(dan == num) {
					break;					
				}
			}
			System.out.println();
		}


	}

}
