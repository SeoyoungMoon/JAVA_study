package ch16;

import java.util.Calendar;

/*
 * 2023.09.18
 * 문서영 실습
 * chapter3 32강 <static 응용 - 싱글톤 패턴>
 * Day12
 * */

public class SchoolTest {

	public static void main(String[] args) {
		
//		School s = new School();		//이렇게 외부에서 만들수 없어 
		School school1 = School.getInstance();		//이렇게 가져다 써야돼. 그럼 외부에서 인스턴스를 생성하지 않아도 가져다 쓸 수 있어. 
		
		School school2 = School.getInstance();
		
		System.out.println(school1 == school2);		//같기 떄문에 true가 리턴돼.
		
//		Calendar calendar = new Calendar();			//달력을 쓰고싶어도 생성을 할 수가 없어.
		Calendar calendar = Calendar.getInstance(); //이렇게 싱글톤으로 써야돼. 그럼 캘린더는 왜 싱글톤일까?
													//그 이유는... 어떤 타임존의 시간이라는건 여러 인스턴스값을 갖지않아. 딱 하나밖에 없어.
													//객체가 가지는 인스턴스값이 여러개면 문제가 될 때 싱글톤으로 제공을 해.
	}

}
