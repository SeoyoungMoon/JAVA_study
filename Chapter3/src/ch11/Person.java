package ch11;

/*
 * 2023.09.13
 * 문서영 실습
 * chapter3 29강 <객체 자신을 가리키는 this> 생성자에서 다른 생성자를 호출하는 this 
 * Day10
 * */

public class Person {
	
	private String name;
	private int age;

	public Person() { 			//이 constructor는 default constructor로 둘건데 
//		age = 10;				//인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없음
		this("이름없음", 1);		//아무것도 없으면 (이름없음, 1)을 가져올거야.  
	}
	
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	//이런식으로 더 많은 constructor가 있다고 해도 타입이 맵핑되서 해당되는 constructor가 호출이 될거야. 
	//this의 또다른 기능이 자기자신의 address를 반환할 수가 있어. 그걸 해볼게
	public Person getPerson() {		//타입이 클래스 자체인 Person으로. 
		return this;
	}
	
	public static void main(String[] args) {		//이 constructor에서 디폴트constructor가 잘 호툴되었어. this의 기능중 하나. 
		Person person = new Person();
		
		System.out.println(person.name);
		System.out.println(person.age);
		
		System.out.println(person.getPerson()); 	//this가 가리키는 인스턴스의 address가 반환. 
	}
	
}




