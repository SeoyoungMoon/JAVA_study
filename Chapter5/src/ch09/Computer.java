package ch09;

/*
 * 2023.12.21
 * 문서영 실습
 * chapter5 48강 <추상 클래스 구현하기> 
 * Day20
 * */

public abstract class Computer {
	
//	public void display();		// ==> 선언만 했으니까 빨간줄이 생겨 몸체를 만들어주든가 abstract로 선언하든가. 
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다. ");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다. ");
	}
	
	/* abstract method 의 의미 : 
	*  Computer라는 클래스가 있고 이 메서드를 상속받은 애들(turnOn(), turnOff())은 공유를 할거야. 
	*  물론 하위클래스에서 맞지 않으면 오버라이딩(재정의) 할수 있어. 
	*  그리고 공통으로 사용될 애들이야. 
	*  "display(), typing()은 지금 구현하기에 어떻게 구현해야될지를 모르겠다." 라는 뜻. 
	*  이 Computer라는 메서드가 노트북인지 데스크탑인지에 따라서 display와 typing도 달라지겠지.
	*  
	*  그래서 얘네는 하위클래스에게 책임을 위임한다고 해. 하위클래스가 구현해라. 하위클래스는 must implemented 해야될 책임이 있어. 반드시 구현해야돼. 
	*  하위클래스가 구체적인 클래스가 되기 위해서는 반드시 구현해야돼. 
	*  
	*/

}
