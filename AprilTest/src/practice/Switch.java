package practice;

/*
 * 2024.03.05
 * 정보처리기사 실기 공부 C언어 
 * doWhile문
 * Day1
 * */

/**
 * case문은 조건에 맞는 case를 들어가면 break를 만날때까지 빠져나오지 못해
 * 미끄럼틀 타듯이 쭉 밑으로 내려가면서 조건들을 만나고 break를 만나야 빠져나올 수 있어. 
 */
public class Switch {

	public static void main(String[] args) {

		int score = 101;
		
		switch(score/10) {
		case 10: 
		case 9: 
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		default:
			System.out.println("F"); 
		}
	}

}
