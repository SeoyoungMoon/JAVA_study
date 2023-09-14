package ch13;

/*
 * 2023.09.14
 * 문서영 실습
 * chapter3 30강 <객체간의 협력 collaboration> 버스의 정보
 * Day11
 * */

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;		//몇번버스인지를 매개변수로 받게끔. 
	}
	
	public void take(int money) {		//버스타는 사람이 돈을 내는 상황
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
