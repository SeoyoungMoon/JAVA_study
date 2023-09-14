package ch13;

/*
 * 2023.09.14
 * 문서영 실습
 * chapter3 30강 <객체간의 협력 collaboration> 지하철의 정보
 * Day11
 * */

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;	//몇호선인지를 매개변수로 받게끔. 
	}
	
	public void take(int money) {		//지하철타는 사람이 돈을 내는 상황
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "호선의 지하철의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
