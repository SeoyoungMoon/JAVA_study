package ch14;

/*
 * 2023.09.14
 * 문서영 실습
 * chapter3 31강 <여러 인스턴스에서 공통으로 사용하는 static 변수>
 * Day11
 * */

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
//		System.out.println(Employee.serialNum);	//static변수를 참조할 때는 참조변수로 호출하지말고 클래스 이름으로 바로 호출해야돼. 
												//private으로 바꿔서 이제 호출못함ㅋ
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
//		Employee.serialNum++;
		
//		System.out.println(Employee.serialNum);
//		System.out.println(Employee.serialNum);
		
		System.out.println(employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeId());
		
		System.out.println(Employee.getSerialNum());
		

	}

}
