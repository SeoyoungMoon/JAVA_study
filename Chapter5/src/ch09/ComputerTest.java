package ch09;

/*
 * 2023.12.21
 * 문서영 실습
 * chapter5 48강 <추상 클래스 구현하기> 
 * Day20
 * */

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer computer = new Computer();		//빨간줄 가보면 "인스턴스가 될 수 없다." 그래서 new할 수 없는 클래스. 
		
		Computer deskTop = new DeskTop();
		deskTop.display();
		deskTop.turnOff();
		
		NoteBook myNoteBook = new MyNoteBook();
		myNoteBook.display();
		myNoteBook.typing();

	}

}
