package ch08;

/*
 * 2023.09.13
 * 문서영 실습
 * chapter3 27강 <참조 자료형 변수> 
 * Day10
 * */


public class Student {

	int studentId;
	String studentName;

	Subject korean;
	Subject math;

	public Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
		
		korean = new Subject(); 	//과목의 점수 이런것들을 넣으려면 인스턴스를 이렇게 생성해줘야돼. 힙에 자리를 만들어주는거. 
		math = new Subject();
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korean.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다. ");
	}

}
