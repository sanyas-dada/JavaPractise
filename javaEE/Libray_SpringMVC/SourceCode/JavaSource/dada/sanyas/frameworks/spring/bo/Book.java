package dada.sanyas.frameworks.spring.bo;

import java.util.List;

public class Book {
	private int isbn;
	private String author;
	private List<Chapter> chapters;
	
	public Book() {
		
	}
	public Book(int isbn, String author, List<Chapter> chapters) {
		this.isbn = isbn;
		this.author= author;
		this.chapters = chapters;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters( List<Chapter> chapters) {
		this.chapters = chapters;
	}

}
