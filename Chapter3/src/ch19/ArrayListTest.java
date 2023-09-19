package ch19;

import java.util.ArrayList;

import ch18.Book;

/*
 * 2023.09.19
 * 문서영 실습
 * chapter3 36강 <객체 배열을 구현한 클래스 ArrayList>
 * Day13
 * */

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("태백산맥1", "조정래"));
		list.add(new Book("태백산맥2", "조정래"));
		list.add(new Book("태백산맥3", "조정래"));
		list.add(new Book("태백산맥4", "조정래"));
		list.add(new Book("태백산맥5", "조정래"));
		
		for(int i=0; i<list.size(); i++) {		//전체 엘리먼트의 개수는 size라는 메서드를 호출해. ArrayList는 지정된 용량만큼 만들어져. 
			list.get(i).showBookInfo();	//i번째 애를 가지고싶다 : get메서드
		}
	}

}
