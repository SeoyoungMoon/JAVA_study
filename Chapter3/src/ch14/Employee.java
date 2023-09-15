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
		int i = 0;		//지역변수. 함수가 호툴될때 생겼다가 함수가 끝나면 사라져. 
//		employeeName = "Lee";		//인스턴스 변수는 static메서드 내에서는 사용할 수 없어. 
									//왜? static메서드는 인스턴스 생성과 상관없이 클래스 이름으로 바로 호출해서 사용하니까.
									//단지 메모리 생성이 보장되지 않은 인스턴스 변수를 사용할 수 없는거.
		return serialNum;	
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}
	
	

}
