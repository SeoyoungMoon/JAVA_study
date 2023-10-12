package ch03;

/*
 * 2023.10.11
 * 문서영 실습
 * chapter5 42강 <상속에서 클래스 생성 과정과 형 변환> - 일반 고객(Customer) 클래스
 * Day18
 * */

public class Customer {
	/*
	 * 고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
	 * 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
	 */
	
	protected int customerId;
	protected String customerName;	//외부 클래스는 접근 할 수 없지만, 하위 클래스는 접근 할 수 있도록 protected 접근 제어자를 사용
	protected String customerGrade;	//protected로 선언한 이유는 상속받은 자식 클래스에서 사용하게 만들기위해. private으로 선언하면 사용안됨. 
	
	int bonusPoint;			//인스턴스 변수들은 초기화가 자동으로 돼. 객체인 경우는 null, integer는 0, double은 0.0 으로. 
	double bonusRatio;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() call");
//	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) call");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + 
				bonusPoint + "입니다. ";
	}
	

}




