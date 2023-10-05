package ch02;

/*
 * 2023.10.05
 * 문서영 실습
 * chapter5 41강 <상속을 활용한 멤버십 클래스 구현하기> - 우수 고객(VIPCustomer) 구현
 * Day17
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
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		salesRatio = 0.05;
		bonusRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentID;
	}

}
