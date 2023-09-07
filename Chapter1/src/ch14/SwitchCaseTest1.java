package ch14;

import java.util.Scanner;

/*
 * 2023.09.07
 * 문서영 실습
 * chapter1 14강
 * Day6
 * */

public class SwitchCaseTest1 {

	public static void main(String[] args) {
		
		int month;
		
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		
		int day = 0;
		
		switch(month) {
		
			case 1: 
				day = 31;
				break;
			case 2: 
				day = 28;
				break;	
			case 3: 
				day = 30;
				break;
			case 4: 
				day = 30;
				break;
			case 5: 
				day = 31;
				break;
			case 6: 
				day = 30;
				break;
			case 7: 
				day = 31;
				break;
			case 8: 
				day = 31;
				break;
			case 9: 
				day = 30;
				break;
			case 10: 
				day = 31;
				break;
			case 11: 
				day = 30;
				break;
			case 12: 
				day = 31;
				break;
			default :
				 System.out.println("error");
		}
		System.out.println(month + "월은 " + day + "일까지 있습니다." );
	}
	
//	case 1: case 3: case 5:  //로 한번에 몰아서 써도 돼
//	day = 31;
//	break;

}
