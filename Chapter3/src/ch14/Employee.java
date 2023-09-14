package ch14;

/*
 * 2023.09.14
 * 문서영 실습
 * chapter3 31강 <여러 인스턴스에서 공통으로 사용하는 static 변수>
 * Day11
 * */

public class Employee {
	
	private static int serialNum = 1000;		//기준이 되는 static변수를 하나 만들었어. static변수는 클래스 안에 있긴 하지만, 클래스 생성과 상관없이
											//프로그램이 로드될 때 이미 생성이 되어있어. 
											//그래서 얘를 참조할 때는 참조변수로 호출하지말고 클래스 이름으로 바로 호출해야돼. 
											//static변수를 다른말로 클래스변수라고도 해. 
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		employeeId = serialNum++;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}
	
	

}
