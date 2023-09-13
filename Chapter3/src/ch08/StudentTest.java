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
		
//		studentKim.studentId = 55;			// 이렇게 학번을 새로 지정할 수 없는 이유는 Student클래스에서 학번을 프라이빗으로 막아뒀기 때문. 
											// 학번을 가져오기 위해서 다른 메서드를 새로 만들어준거야. 
		System.out.println(studentLee.getStudentId());
		System.out.println(studentKim.getStudentId());
		
		studentKim.setStudentName("James");
		studentKim.showStudentScore();
	}

}
