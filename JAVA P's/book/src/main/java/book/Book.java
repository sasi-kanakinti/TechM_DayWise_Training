package book;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String isbn;
	private String publisher;
	private String publishedDate;
	private String language;
	private int numberOfPages;	
	@OneToMany(mappedBy = "id")
	private List<Author> authors = new ArrayList<>();
	
    public Book() {
    }
	
    public Book(String title, String isbn, String publisher, String publishedDate, String language, int numberOfPages) {
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.language = language;
		this.numberOfPages = numberOfPages;
	}
	
    public Long getId() {
        return id;
    }
	
    public void setId(Long id) {
        this.id = id;
    }
	
    public String getTitle() {
        return title;
    }
	
    public void setTitle(String title) {
        this.title = title;
    }
	
    public String getIsbn() {
        return isbn;
    }
	
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
	
    public String getPublisher() {
        return publisher;
    }
	
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
	
    public String getPublishedDate() {
        return publishedDate;
    }
	
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }
	
    public String getLanguage() {
        return language;
    }
	
    public void setLanguage(String language) {
        this.language = language;
    }
	
    public int getNumberOfPages() {
        return numberOfPages;
    }
	
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}