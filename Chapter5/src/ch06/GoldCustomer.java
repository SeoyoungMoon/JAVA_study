package ch06;

/*
 * 2023.10.16
 * 문서영 실습
 * chapter5 45강 <다형성과 다형성을 사용하는 이유> 
 * Day19
 * */

public class GoldCustomer extends Customer{
	
	double salesRatio;

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;
	}
	
	@Override	
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}


}
