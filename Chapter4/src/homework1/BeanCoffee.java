package homework1;

/*
 * 2023.09.20
 * 문서영 실습
 * chapter4 37강 <객체간의 협력 - 출근길에 커피사기>
 * Day14
 * */

public class BeanCoffee {
	
	int money;
	
	public String bewing(int money) {
		
		this.money += money;
		
		if(money == Menu.BEANAMERICANO) {
			return "콩다방 아메리카노를 구입했습니다.";
		} else if(money == Menu.BEANLATTE) {
			return "콩다방 라떼를 구입했습니다.";
		} else return null;
	}

}
