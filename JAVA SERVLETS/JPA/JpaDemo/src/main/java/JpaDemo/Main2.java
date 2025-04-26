package JpaDemo;
 
import jakarta.persistence.EntityManager;
 
 
public class Main2 {
 
	public static void main(String[] args) {
		
		EntityManager em=JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		Employee emp1=new Employee("prem_vishnu","Training",500);
		
		em.persist(emp1);
		
		
		
		 Employee emp2=em.find(Employee.class,1);
		
		 System.out.println(emp2.getName());
		 System.out.println(emp2.getId());
		
		 emp2.setSalary(5000);
		
		 em.merge(emp2);
		
		 em.remove(emp2);
		
		 em.getTransaction().commit();
		
		
		em.close();
		
		JPAUtil.close();
		
		
		
		
	}
 
}
 
 