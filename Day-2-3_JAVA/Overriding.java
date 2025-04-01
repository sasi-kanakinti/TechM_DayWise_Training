
class Employee{
  int calculateSalary(){
    return 50000;
  }
}

class Manager extends Employee{
  int calculateSalary(){
    return super.calculateSalary() + 10000;
  }
}
public class Overriding {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();
        System.out.println(emp.calculateSalary()); 
        System.out.println(mgr.calculateSalary()); 
    }
}