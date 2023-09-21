package homework2;

/*
 * 2023.09.21
 * 문서영 실습
 * chapter4 38강 <static활용 - 자동차 공장에서 자동차 생산하기> - 설명에 따른 객체를 구현하여 테스트 코드가 실행되도록 구현하기
 * Day15
 * */

public class CarFactoryTest {
	
	/*
	 * 자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때마다 고유의 번호가 부여됩니다. 
	 * 자동차 번호가 10001부터 시작되어 자동차가 생산될 때마다 10002, 10003 이렇게 번호가 붙도록  
	 * 자동차 공장 클래스, 자동차 클래스를 구현하세요
	 * 다음 CarFactoryTest.java 테스트 코드가 수행 되도록 합니다.
	 * 싱글톤 패턴 + static 변수 활용
	 */
	

	/*-------"Factory pattern" : 객체를 직접 new해서 생성하지 않고 메서드를 두고 그 메서드 안에서 객체 생성에 대한 구현을 하는거.
	 *이렇게 createCar하는것처럼 팩토리를 만들고나서 Car클래스를 생성하는거. */
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());		//10001 출력
		System.out.println(yourSonata.getCarNum());		//10002 출력

	}

}
