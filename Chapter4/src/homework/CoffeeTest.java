package homework;

/*
 * 2023.09.20
 * 문서영 실습
 * chapter4 37강 <객체간의 협력 - 출근길에 커피사기>
 * Day14
 * */

public class CoffeeTest {
	
	/*
	 * 아침 출근깅에 김 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 
	 * 이 씨는 콩다방에서 4,500원을 내고 라테를 사 마셨습니다. 
	 * 이 과정을 객체간의 협력을 기반으로 구현해보세요
	 */

	public static void main(String[] args) {

		Person personKim = new Person("Kim", 10000);
		Person personLee = new Person("Lee", 20000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		personKim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		personLee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		
	}

}
