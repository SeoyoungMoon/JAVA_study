package ch19;

/*
 * 2023.09.19
 * 문서영 실습
 * chapter3 35강 <2차원 배열 사용하기>
 * Day13
 * */

public class TwoDimensionTest {

	public static void main(String[] args) {

//		int[][] arr = new int[2][3];
		
//		System.out.println(arr.length);			//전체 배열의 길이는 행의 수
//		System.out.println(arr[0].length);		//각 행의 길이는 열의 수
		
		int[][] arr = {{1,2,3}, {4,5,6,7}};
		
		int i, j;
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");		//첫번째 행은 열이 세개, 두번째 행은 열이 네개.
			}
			System.out.println();
		}
		
	}

}
