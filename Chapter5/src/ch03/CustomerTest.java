package ch03;

/*
 * 2023.10.11
 * 문서영 실습
 * chapter5 42강 <상속에서 클래스 생성 과정과 형 변환> 
 * Day18
 * */

public class CustomerTest {

	public static void main(String[] args) {

//		Customer customerMoon = new Customer();
//		customerMoon.setCustomerName("문서영");
//		customerMoon.setCustomerId(10010);
//		customerMoon.bonusPoint = 1000;
//		System.out.println(customerMoon.showCustomerInfo());
		
		Customer customerBae = new VIPCustomer(10011, "배찬열");
//		customerBae.setCustomerName("배찬열");
//		customerBae.setCustomerId(10011);
		customerBae.bonusPoint = 10000;
		
//		customerBae.
		
		VIPCustomer vCustomer = new VIPCustomer(0, "Lee");
//		vCustomer.
		
		System.out.println(customerBae.showCustomerInfo());
	}

}
