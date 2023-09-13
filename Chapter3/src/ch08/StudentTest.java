package ch08;

/*
 * 2023.09.13
 * 문서영 실습
 * chapter3 27강 <참조 자료형 변수> 
 * Day10
 * */

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");	//Student라는 클래스를 studentLee라는 변수의 데이터 타입으로 만드는게 참조자료형 변수
		Student studentKim = new Student(101, "Kim");
		
		studentLee.setKoreanSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);

		studentKim.setKoreanSubject("국어", 90);
		studentKim.setMathSubject("수학", 85);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
