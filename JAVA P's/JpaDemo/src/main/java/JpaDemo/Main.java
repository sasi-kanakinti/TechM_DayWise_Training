package JpaDemo;
import jakarta.persistence.EntityManager;
 import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean val=true;
		
		EntityManager em=JPAUtil.getEntityManager();
		
		
		System.out.println("Do you want to Enter employee details: ");
		char cho=sc.next().charAt(0);
		while(val) {
		if(cho == 'Y')
		{
			System.out.println("Enter the no. of employees details to enter:");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Name, Department and Salary of the "+(i+1)+"th employee: ");
				em.getTransaction().begin();
				Employee emp1=new Employee(sc.next(),sc.next(),sc.nextDouble());
				em.persist(emp1);
				em.getTransaction().commit();
	
			//	To Read 
			//	Employee emp2=em.find(Employee.class,1);
			//	System.out.println(emp2.getName());
			
				
			//	To update 
			//	emp1.setSalary(10000);
			//	em.merge(emp2);
			
			
			//	To Delete
			//	em.getTransaction().begin();
			//	em.remove(emp2);
			//	e,.getTranscation().commit();
				
				
			}
		}
			else if(cho=='N')
			{
				val=false;
				break;
			}
			else
			{
				System.out.println("Enter either 'Y' for Yes or 'N' for No");
			}
		}
		System.out.println("Do you want to delete recent Entered Entry: (Y/N): ");
		char opt=sc.next().charAt(0);
		while(val) {
		if(opt=='Y')
		{
			//em.remove(emp2);
		}
		else if(opt=='N')
		{
			val=false;
			break;
		}
		else
		{
			System.out.println("Enter either 'Y' for Yes or 'N' for No");
		}
		}
		
		
		em.close();
		
		sc.close();
		
		JPAUtil.close();
	}
 
}
 
 