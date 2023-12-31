package ch18;

/*
 * 2023.09.18
 * 문서영 실습
 * chapter3 34강 <객체 배열 사용하기>
 * Day12
 * */

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for(Book book : library) {				//이렇게 하면 다 null이 나와 
//			System.out.println(book);
//		}
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(Book book : library) {		
			book.showBookInfo();
			System.out.println(book);
		}
		
	}

}
