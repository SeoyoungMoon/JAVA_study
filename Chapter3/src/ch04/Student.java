package ch04;

/*
 * 2023.09.12
 * 문서영 실습
 * chapter3 24강 <객체의 속성은 멤버변수로, 객체의 기능은 메서드로 구현한다.>
 * Day9
 * */

public class Student {

	int studentId;
	String studentName;
	String studentAddress;
	
	public Student() {}			//생성자가 밑에까지 총 세개잖아. 그걸 오버로딩 이라고 해. 이름은 같고 매개변수가 다름으로서 하나이상의 생성자가 있는거. 
		
	public Student(int studentId, String studentName) {
		this.studentId = studentId;		//이렇게 쓰면 왼쪽의 studentId는 위의 인스턴스변수.  오른쪽의 studentId는 이 Student생성자의 매개변수
										//this 라고 써주면 내 인스턴스다. 
		this.studentName = studentName;
	}
	
	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;		//이렇게 쓰면 왼쪽의 studentId는 위의 인스턴스변수.  오른쪽의 studentId는 이 Student생성자의 매개변수
										//this 라고 써주면 내 인스턴스다. 
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public void showStudentInfo() {
		System.out.println(studentId + "," + studentName + "," + studentAddress);
	}

	public String getStudentName() {	//studentName가 string으로 위에 선언했기 때문에 함수 타입도 string
		return studentName;
	}
	
	//main함수를 사용하는 클래스를 따로 만들거야. 이렇게 안하구
//	public static void main(String[] args) {	
//		Student student = new Student();
//		student.studentAddress = "12345";
//		student.showStudentInfo();
//	}
}
