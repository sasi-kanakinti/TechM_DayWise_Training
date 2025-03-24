package book;

import java.util.ArrayList;
import java.util.*;
import jakarta.persistence.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Author author = new Author(sc.next(),sc.next(),sc.next());
		List<Book> books = new ArrayList<>();
		books.add(new Book(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextInt()));
		books.add(new Book(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextInt()));
		author.setBooks(books);
		em.persist(author);
		tx.commit();
		em.close();
		sc.close();
		JPAUtil.shutdown();
	}
}