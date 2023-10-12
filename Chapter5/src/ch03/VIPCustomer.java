package ch03;

/*
 * 2023.10.11
 * 문서영 실습
 * chapter5 42강 <상속에서 클래스 생성 과정과 형 변환> - 우수 고객(VIPCustomer) 구현
 * Day18
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
	
	public VIPCustomer(int customerId, String customerName) {
		
		super(customerId, customerName);
		customerGrade = "VIP";
		salesRatio = 0.05;
		bonusRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public int getAgentId() {
		return agentID;
	}

}
