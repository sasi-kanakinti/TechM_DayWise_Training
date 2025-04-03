package jpa_library;

public class Main {

	public static void main(String[] args) {
		AuthorService authorService = new AuthorService();
        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        
        Author author = new Author();
        author.setName("Ramana");
        author.setName("GR");
        authorService.save(author);
        
        Book book = new Book();
        book.setTitle("Machine Leaning");
        book.setTitle("DataScience");
        book.setQuantity(20);
        book.setQuantity(15);
        book.setAuthor(author);
        bookService.save(book);
        
        Member member = new Member();
        member.setName("Sasi");
        member.setBranch("CSE");
        memberService.save(member);
        
        JPAUtil.close();
		
	}

}
