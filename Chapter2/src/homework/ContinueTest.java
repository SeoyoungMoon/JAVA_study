package homework;

/*
 * 2023.09.11
 * 문서영 실습
 * chapter2 연습문제 풀기 < continue문을 사용해서 구구단 짝수 단만 출력해보기 >
 * Day8
 * */

public class ContinueTest {

	public static void main(String[] args) {
		
		//continue문은 보통 for문의 if문에서 계속할 떄 사용해. 
		
		int i;	//단 수
		int n;	//곱할 수
		
		System.out.println("구구단 출력 시작!\n");
		
		for(i=1; i<9; i++) {
			if( i % 2 == 0) {
				System.out.println("구구단 " + i + "단 출력!");
				for(n=1; n<=9; n++) {
					System.out.println(i + " x " + n + " = " + i*n);
					continue;
				}
				System.out.println();
			} 
		}
		
	}

}
