interface Add{
    int add(int a,int b);
}
 
interface Sub{
      int sub(int a,int b);
}
 
class Cal implements Add , Sub
{
     
      public int add(int a,int b){
          return a+b;
    }
      
      public int sub(int a,int b){
        return a-b;
    }
}
 
class interf2{
    
    public static void main (String[] args) 
    {
          
          Cal x = new Cal();
          System.out.println("Addition : " + x.add(2,1));
          System.out.println("Substraction : " + x.sub(2,1));
    }
}