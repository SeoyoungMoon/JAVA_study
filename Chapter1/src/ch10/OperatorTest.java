package ch10;

/*
 * 2023.09.04
 * 문서영 실습
 * Day3
 * */

public class OperatorTest {

	public static void main(String[] args) {
		
		int total = 10;
		int add = 20;
		
		total += add;
		
		System.out.println(total);
		
		int gameScore = 100;
		int myScore;
		
		myScore = ++gameScore;
		System.out.println(myScore + "," + gameScore);
		
		myScore = gameScore++;
		System.out.println(myScore + "," + gameScore);
		

	}

}
