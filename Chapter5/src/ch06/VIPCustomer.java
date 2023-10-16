package ch06;

/*
 * 2023.10.16
 * 문서영 실습
 * chapter5 45강 <다형성과 다형성을 사용하는 이유> 
 * Day19
 * */

public class VIPCustomer extends Customer {
	
	/*
	 * 매출에 더 많은 기여를 하는 단골 고객
	 * 제품을 살때 10%를 할인해 줌
	 * 보너스 포인트는 제품 가격의 5%를 적립해 줌
	 * 담당 전문 상담원이 배정됨
	 */
	
	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		
		super(customerId, customerName);
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		this.agentID = agentId;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public int getAgentId() {
		return agentID;
	}
	
	@Override		//이 어노테이션이 뭐냐면 밑에 오버라이딩한 메서드가 맞는지 체크해주는 역할. 
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 상담원 아이디는 " + agentID ;
	}
	
	

}
