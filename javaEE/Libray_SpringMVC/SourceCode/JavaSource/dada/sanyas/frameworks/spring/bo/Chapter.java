package dada.sanyas.frameworks.spring.bo;

public class Chapter {
	private int number;
	private Title title;
	private String content;
	
	public Chapter() {
		
	}
	public Chapter(int number,Title title, String content) {
		this.number = number;
		this.title = title;
		this.content = content;
	}
	public int getNumber() {
		return number;
	}
	public Title getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setNumber(int number) {
		this.number= number;
	}
	public void setTitle(Title title) {
		this.title= title;
	}
	public void setContent(String content) {
		this.content= content;
	}
	
	
	
	
	
	
	
	

}
