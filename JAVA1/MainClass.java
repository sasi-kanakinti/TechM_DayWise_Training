class MainClass {
    int id;
    String n;
 
    public void set(int num , String name){
        id = num;
        n = name;
    }  
    public void get(){
        System.out.println("id:"+id);
        System.out.println("name : "+n);
    }
    public static void main(String args[]) {
        MainClass s1 = new MainClass();
        s1.set(101 , "abc");
        s1.get();

        MainClass s2 = new MainClass();
        s2.set(102 , "aabc");
        s2.get();
    }
}