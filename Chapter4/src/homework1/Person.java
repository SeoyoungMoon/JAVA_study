package homework1;

/*
 * 2023.09.20
 * 문서영 실습
 * chapter4 37강 <객체간의 협력 - 출근길에 커피사기>
 * Day14
 * */

public class Person {
	
	String name;
	int money;
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.bewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "으로 " + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.bewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님이 " + money + "으로 " + message);
		}
	}

	
}
