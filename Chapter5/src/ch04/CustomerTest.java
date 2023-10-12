package ch04;

/*
 * 2023.10.11
 * 문서영 실습
 * chapter5 43강 <메서드 재정의하기> 
 * Day18
 * */

public class CustomerTest {

	public static void main(String[] args) {
		
		int price = 10000;

		Customer customerMoon = new Customer();
		customerMoon.setCustomerName("문서영");
		customerMoon.setCustomerId(10010);
		customerMoon.bonusPoint = 1000;
		int cost = customerMoon.calcPrice(price);
		System.out.println(customerMoon.showCustomerInfo() + "지불 금액은 " + cost + "원 입니다. ");
		
		VIPCustomer customerBae = new VIPCustomer();
		customerBae.setCustomerName("배찬열");
		customerBae.setCustomerId(10011);
		customerBae.bonusPoint = 10000;
		cost = customerBae.calcPrice(price);
		System.out.println(customerBae.showCustomerInfo() + "지불 금액은 " + cost + "원 입니다. ");
		
		Customer customerDoo = new VIPCustomer();
		customerDoo.setCustomerName("Doo");
		cost = customerDoo.calcPrice(price);
		System.out.println(customerDoo.showCustomerInfo() + "지불 금액은 " + cost + "원 입니다. ");
		
	}

}
