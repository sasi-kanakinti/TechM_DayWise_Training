class Outer{
    private String message = "This is string from Outer Class";
    //public String message = "This is string from Outer Class";
    public void o_m(){
        System.out.println("This is a method from outer class");
    }

    class Inner{
        public void i_m(){
            System.out.println("This is a method from inner class");
            System.out.println("Access a value of outer class : " + message);
        }
    }
}
 
class InnerCls{
    public static void main(String[] args){
    Outer out = new Outer();
    out.o_m();
    //System.out.println("Message : "+out.message);
    Outer.Inner inn = out.new Inner();
    inn.i_m();
    }
}