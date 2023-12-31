package ch06;

import java.util.ArrayList;

/*
 * 2023.10.16, 10.23
 * 문서영 실습
 * chapter5 45강 <다형성과 다형성을 사용하는 이유> , 47강 <다운캐스팅과 instance of>
 * Day19
 * */

/*다형성(polymorphism) 이란?
 * 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
 * 같은 코드에서 여러 다른 실행 결과가 나옴
 * 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
 * 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음
 * */

/*다형성을 사용하는 이유?
 * 다른 동물을 추가하는 경우
 * 상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들 수 있음
 * 그렇지 않는 경우 많은 if-else if문이 구현되고 코드의 유지보수가 어려워짐
 * */

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다. ");
	}

	public void eating() {
		
	}

}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다. ");
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다. ");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다. ");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아갑니다. ");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal ani : animalList) {
			ani.move();													//여기가 다형성 구현. 가상메서드에 의해서 move라는 똑같은 메서드를 호출했지만 인스턴스가 뭐냐에 따라서 각 인스턴스에 해당되는 move메서드가 호출됐어. 
		}
		
		animalMove(hAnimal);
		animalMove(tAnimal);
		animalMove(eAnimal);

		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
	}
	
	public static void animalMove( Animal animal) {
		animal.move();	
	}

	public static void testDownCasting(ArrayList<Animal> animalList) {
		
		for(int i=0; i<animalList.size(); i++) {
			
			Animal animal = animalList.get(i);
			
			if(animal instanceof Human) {		//instanceof라는 키워드로 인스턴스 형이 맞는지 여부를 체크해. 맞으면 true, 다르면 false를 반환
				Human human = (Human)animal;	//다운캐스팅 하는 방법은 이거야. 
				human.readBooks();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} else {
				System.out.println("error");
			}
			
		}
		
	}
}
