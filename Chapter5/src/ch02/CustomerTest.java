package ch02;

/*
 * 2023.10.05
 * 문서영 실습
 * chapter5 41강 <상속을 활용한 멤버십 클래스 구현하기>
 * Day17
 * */

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerMoon = new Customer();
		customerMoon.setCustomerName("문서영");
		customerMoon.setCustomerId(10010);
		customerMoon.bonusPoint = 1000;
		System.out.println(customerMoon.showCustomerInfo());
		
		VIPCustomer customerBae = new VIPCustomer();
		customerBae.setCustomerName("배찬열");
		customerBae.setCustomerId(10011);
		customerBae.bonusPoint = 10000;
		System.out.println(customerBae.showCustomerInfo());
	}

}
