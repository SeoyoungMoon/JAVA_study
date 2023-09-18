package ch18;

/*
 * 2023.09.18
 * 문서영 실습
 * chapter3 34강 <객체 배열 사용하기>
 * Day12
 * */

public class Book {
	
	private String title;
	private String author;
	
	public Book() {}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(author + ", " + title);
	}

}
