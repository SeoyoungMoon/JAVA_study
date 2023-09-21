package homework2;

/*
 * 2023.09.21
 * 문서영 실습
 * chapter4 38강 <static활용 - 자동차 공장에서 자동차 생산하기> - 설명에 따른 객체를 구현하여 테스트 코드가 실행되도록 구현하기
 * Day15
 * */

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}		//constructor를 그냥 두면 디폴트 constructor가 생기니까 프라이빗으로 하나 만들어. 
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}

}
