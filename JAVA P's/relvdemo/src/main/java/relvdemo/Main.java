package relvdemo;
 
import jakarta.persistence.EntityManager;
 
 
 
public class Main {
 
	public static void main(String[] args) {
		
		EntityManager em=JPAUtil.getEntityManager();
		
		 em.getTransaction().begin();
		
		/*Author author = new Author("George Orwell");
	        author.addBook(new Book("1983"));
	        em.persist(author);*/
		
		 Author a1=new Author("vishnu");
		  Author a2=new Author("Sai");
		  
		  em.persist(a1);
		  em.persist(a2);
		
		 Book b1=new Book("DSA",a1);
		 Book b2=new Book("C",a2);
		 em.persist(b1);
		 em.persist(b2);
		
		 em.getTransaction().commit();
		 em.getTransaction().begin();
		
		Book fetchedBook = em.find(Book.class,b1.getId());
		 System.out.println("Book: " + fetchedBook.getTitlel());
 
	        System.out.println("Accessing Author...");
	        
	        System.out.println(fetchedBook.getAuthor().getName());
	        em.getTransaction().commit();
	        em.close();
	        JPAUtil.close();
		
		
 
	}
 
}
 
 