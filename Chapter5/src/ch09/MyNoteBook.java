package ch09;

/*
 * 2023.12.21
 * 문서영 실습
 * chapter5 48강 <추상 클래스 구현하기> 
 * Day20
 * */

public class MyNoteBook extends NoteBook{

	//abstract 상속을 받았을 때 위임의 책임을 다해야돼.
	
	@Override
	public void display() {
		
		System.out.println("MyNoteBook display");
		
	}

}
