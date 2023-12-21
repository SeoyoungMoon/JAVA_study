package ch09;

/*
 * 2023.12.21
 * 문서영 실습
 * chapter5 48강 <추상 클래스 구현하기> 
 * Day20
 * */

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display ");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing ");
	}
	
	@Override
	public void turnOff() {
		System.out.println("DeskTop turnOff ");
	}
	
}
	
