package ch09;

/*
 * 2023.09.13
 * 문서영 실습
 * chapter3 28강 <접근 제어 지시자와 정보은닉과 캡슐화> 이 생일이 정말 유효한 생일인지를 체크. getter, setter메서드의 필요성
 * Day10
 * */

public class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;		//여기에 멤버변수로 선언해줘 클래스 전체에 쓰일수 있잖아. 	//boolean은 원래 초기값이 false야. 
	
	public BirthDay() {
		isValid = true;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
			return;
		}
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 0) {
			isValid = false;
			return;
		}
		this.year = year;
	}
	
	public boolean isValid() {
		return isValid;
	}
	
    public void printThis() {
    	System.out.println(this);
    }
	

}
