package ch03;

/*
 * 2023.09.12
 * 문서영 실습
 * chapter3 23강 < 함수와 메서드 >
 * Day9
 * */

public class FunctionTest {
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);	//addNum이라는 함수를 만들었고 이 함수를 불러서 쓸거야. n1, n2 라는 매개변수를 넘겨준다고 해. 
		
		System.out.println(total);	//무슨 숫자를 더할일이 있을땐 이제 addNum이라는 함수를 호출하면 돼. 
		
		sayHello("Hello");			//반환값이 없기 떄문에 그냥 함수를 불러주기만 하면 돼. Hello라는 매개변수는 있고. 
		
		int sum = calcSum(); 		//반환값은 없고 매개변수는 있는 함수. 받는값은 없지만 기능은 있는. 
		System.out.println(sum);
		
	}
	
	public static int addNum(int num1, int num2) {	//main함수가 static이기 때문에 메인에서 호출하는 함수도 static이어야 돼. 
													//두개의 integer를 받아서 하나의 integer를 반환해준다.
		return num1 + num2;
		
	}
	
	public static void sayHello(String str) {	//반환값이 없는 함수. 반환값이 없기 때문에 void라고 써.
		
		System.out.println(str);
		
	}
	
	public static int calcSum() {
		
		int i;
		int sum = 0;
		
		for(i=0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	

}





