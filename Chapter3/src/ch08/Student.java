package ch08;

/*
 * 2023.09.13
 * 문서영 실습
 * chapter3 27강 <참조 자료형 변수> 
 * Day10
 * */


public class Student {

	private int studentId;			//이런 경우에 학번이 다른 클래스에서 새로 선언하게 되면 학번이 바뀌니까 안바뀌게 하려면 앞에 프라이빗을 써주면 돼. 
	private String studentName;

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
	
	public int getStudentId() {						//private 변수의 값을 제공해줄때 get메서드를 만들어서 써. 
		return studentId;
	}
	
	public void setStudentName(String name) {		//private 변수의 값을 변경 가능하게 해줄때 set을 만들어서 써. 
		this.studentName = name;
	}
	
	//getter, setter는 우클릭 -> generate getters and setters 누르면 자동으로 만들어져. 
	/*
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	*/
}
