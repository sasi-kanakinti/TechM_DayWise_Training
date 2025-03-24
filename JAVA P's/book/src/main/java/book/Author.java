   package book;

    import java.util.ArrayList;
    import java.util.List;
	import jakarta.persistence.*;

	@Entity
	@Table(name = "author")
	public class Author {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String name;
		private String email;
		private String phoneNumber;
		@OneToMany(mappedBy = "id")
		private List<Book> books = new ArrayList<>();
		public Author() {
		}
		public Author(String name, String email, String phoneNumber) {
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public List<Book> getBooks() {
			return books;
		}
		public void setBooks(List<Book> books) {
			this.books = books;
		}
	}