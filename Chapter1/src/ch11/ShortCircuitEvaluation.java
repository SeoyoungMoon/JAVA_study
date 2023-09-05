package ch11;

/*
 * 2023.09.04
 * 문서영 실습
 * Day3
 * */

public class ShortCircuitEvaluation {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value;
		
		value = ( (num1 = num1 + 10 ) < 10 ) && ( ( i = i + 2 ) < 10);	//논리곱인 경우에 앞의 항이 false이면 뒤의 항은 실행도 되지x
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ( (num1 = num1 + 10 ) < 10 ) || ( ( i = i + 2 ) < 10);	//논리합인 경우에 앞의 항이 true이면 뒤의 항은 실행도 되지x
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
