package ch04;

/*
 * 2023.09.12
 * 문서영 실습
 * chapter3 24강 <객체의 속성은 멤버변수로, 객체의 기능은 메서드로 구현한다.> 이 클래스는 우리가 만든 객체를 돌려보는 용도. 
 * Day9
 * */

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");		//studentLee는 참조변수. 생성된 객체를 가리켜. new해서 student하나가 생성된거야. 
		studentLee.studentName = "Lee";						//이 생성된 student가 인스턴스.
		studentLee.studentAddress = "Seoul";				//생성된 studentLee의 이름과 주소를 가져온거야. 
		
		Student studentKim = new Student(101, "Kim", "New York");		//student라는 객체 타입으로 studentKim이라는 변수를 선언했고. new~ 는 생성을 해라. 
//		studentKim.studentName = "Kim";						// .하면 여기서 사용할 수 있는 인스턴스 변수들, 메서드들이 보여. 
//		studentKim.studentAddress = "New York";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);						//ch04.Student@64485a47 가 출력되는데 @앞은 패키지+클래스명. 클래스의 풀네임. 
		System.out.println(studentKim);						//@뒤는 32비트짜리 주소.
		
	}

}
