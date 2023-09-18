package ch16;

/*
 * 2023.09.18
 * 문서영 실습
 * chapter3 32강 <static 응용 - 싱글톤 패턴>
 * Day12
 * */

public class School {
	
	private static School instance = new School();		//이 instance가 유일한 객체
	
	private School() {}		//이런 constructor를 만들었기 떄문에 SchoolTest클래스에서 new해서 생성할 수 없어. 
		
	public static School getInstance() {  		//외부에서 가져다 쓸 수 있게 해주는거.	//인스턴스를 생성하지 않아도 쓸 수 있게 static으로 선언.
		if(instance == null) {
			instance = new School();	//null이면 한번 생성을 해주기. 
		}
		return instance;
	}

}
