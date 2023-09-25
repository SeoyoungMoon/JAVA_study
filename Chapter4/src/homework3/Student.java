package homework3;

import java.util.ArrayList;

/*
 * 2023.09.25
 * 문서영 실습
 * chapter4 39강 <ArrayList를 활용한 간단한 성적 산출 프로그램 만들기>
 * Day16
 * */

public class Student {
	
	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			
			total += s.getScorePoint();
			System.out.println(studentName + "학생의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다. ");
			
		}
		System.out.println(studentName + "학생의 총점은 " + total + "입니다. ");
	}
}
