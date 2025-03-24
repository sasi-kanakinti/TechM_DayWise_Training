package empdet;
import jakarta.persistence.EntityManager;
 import java.util.*;
 
public class Main {
	
	static EntityManager em=JPAUtil.getEntityManager();
	static Scanner sc=new Scanner(System.in);
	static boolean val=true;
 
	public static void main(String[] args) 
	{	
		while(val) 
		{
			System.out.println("\t\t **********Employee Details**********\t\t");
			System.out.println("1.Add Entries\n2.Show Entries\n3.Update Entries\n4.Delete Entries\n5.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			
			case 1:
				System.out.println("\t\t***********Add Details***********\t\t");
				Add();
				break;
			
			case 2:
				System.out.println("\\t\\t **********Employee Details**********\\t\\t");
				Show();
				break;
						
			case 3:
				System.out.println("\t\t***********Update Details***********\t\t");
				Update();
				break;
				
			case 4:
				System.out.println("\t\t***********Delete Details***********\t\t");
				Delete();
				break;
				
			case 5:
				System.out.println("Exiting...");		
				val=false;
				break;
							
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}			
		sc.close();			
		JPAUtil.close();
	}


	private static void Add() {
		try{
			System.out.println("Enter Number of Employees Details to enter:");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				AddEmployee();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}	

	
	private static void Show() {
		try{
			List<Employee> list = em.createQuery("select e from Employee e", Employee.class).getResultList();
			for(Employee e:list)
			{
				System.out.println("Employee ID:"+e.getId());
				System.out.println("Employee Name:"+e.getName());
				System.out.println("Employee Department:"+e.getDepartment());
				System.out.println("Employee Salary:"+e.getSalary());
				System.out.println("");
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}


    private static void Update() {
		try{
			System.out.println("Enter Employee ID:");
			int id=sc.nextInt();
			Employee emp=em.find(Employee.class, id);
			if(emp!=null)
			{
				System.out.println("Enter Employee Name:");
				emp.setName(sc.next());
				System.out.println("Enter Employee Department:");
				emp.setDepartment(sc.next());
				System.out.println("Enter Employee Salary:");
				emp.setSalary(sc.nextDouble());
				em.getTransaction().begin();
				em.merge(emp);
				em.getTransaction().commit();
				System.out.println("Employee Details Updated Successfully");
			}
			else
			{
				System.out.println("Employee ID not found");
			}
			}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}

	private static void Delete() 
	{
		try{
			System.out.println("Enter Employee ID:");
			int id=sc.nextInt();
			Employee emp=em.find(Employee.class, id);
			if(emp!=null)
			{
				em.getTransaction().begin();
				em.remove(emp);
				em.getTransaction().commit();
				System.out.println("Employee Details Deleted Successfully");
			}
			else
			{
				System.out.println("Employee ID not found");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}

	private static void AddEmployee() {
		try
		{
			Employee emp=new Employee();
			System.out.println("Enter Employee Name:");
			emp.setName(sc.next());
			System.out.println("Enter Employee Department:");
			emp.setDepartment(sc.next());
			System.out.println("Enter Employee Salary:");
			emp.setSalary(sc.nextDouble());
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
			System.out.println("Employee Details Added Successfully");
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
 