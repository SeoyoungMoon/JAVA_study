package ch09;

/*
 * 2023.09.13
 * 문서영 실습
 * chapter3 28강 <접근 제어 지시자와 정보은닉과 캡슐화> 
 * Day10
 * */

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		day.setYear(2023);
		day.setMonth(9);		//BirthDay클래스에서 if문으로 조건을 걸어줬고 처음에 true로 해줬기 때문에 조건에 안맞으면 false가 나와. 
		day.setDay(13);
		
		System.out.println(day.isValid());
		System.out.println(day);		//위에서 선언해준 참조변수가 가리키는 day의 값은 ch09.BirthDay@64485a47
		day.printThis();				//printThis라는 메서드에서 this가 가리키는 값은 ch09.BirthDay@64485a47
										//똑같아 두개가. 그건 뭘 의미하냐면, 똑같이 생성된 인스턴스 address를 가리킨다. 
	}

}
