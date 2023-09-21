package homework2;

/*
 * 2023.09.21
 * 문서영 실습
 * chapter4 38강 <static활용 - 자동차 공장에서 자동차 생산하기> - 설명에 따른 객체를 구현하여 테스트 코드가 실행되도록 구현하기
 * Day15
 * */

public class Car {
	
	private static int serialNum = 10000;		//기준이 되는 번호를 하나 만들어.
	private int carNum;							//차가 생성될때마다 차가 고유번호를 가지게 돼. 
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
}
