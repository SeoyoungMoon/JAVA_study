package ch13;

/*
 * 2023.09.14
 * 문서영 실습
 * chapter3 30강 <객체간의 협력 collaboration> 학생의 정보
 * Day11
 * */

public class Student {
	String studentName;
	int grade;		
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;	
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}	
	
	public void showStudentInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}

}