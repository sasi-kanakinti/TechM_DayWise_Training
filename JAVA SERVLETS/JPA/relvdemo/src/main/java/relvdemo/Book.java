package relvdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titlel;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	public Book()
	{}
	public Book(String titlel, Author author) {
		super();
		
		this.titlel = titlel;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitlel(String titlel) {
		this.titlel = titlel;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getTitlel() {
		return titlel;
	}
	
}
