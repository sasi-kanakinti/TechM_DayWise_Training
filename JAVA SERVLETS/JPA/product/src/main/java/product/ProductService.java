package product;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductService {
    private EntityManagerFactory emf;
 
    public ProductService() {
        this.emf = Persistence.createEntityManagerFactory("EmployeePU");
    }
 
    public void addProduct(String name, double price) {
        EntityManager em = emf.createEntityManager();
//        try 
//        {
        	em.getTransaction().begin();
        	Product product = new Product(name, price);
        	em.persist(product);
        	em.getTransaction().commit();
//        }
        
//        catch(Exception e)
//        {
//        	em.getTransaction().rollback();
//        }
        
        em.close();
    }
 
    public Product getProductById(Long id) {
        EntityManager em = emf.createEntityManager();
        Product product = em.find(Product.class, id);  // First fetch - DB Hit
        em.close();
        return product;
    }
 
    public List<Product> getAllProducts() {
        EntityManager em = emf.createEntityManager();
        List<Product> products = em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
        em.close();
        return products;
    }
}
 
 