// // // // //parent class
// // // // class Parent
// // // // {
// // // //     void p_c()
// // // //     {
// // // //         System.out.println("Parent class");
// // // //     }
// // // // }



// // // // //child class
// // // // public class Inheri extends Parent{

// // // //     public void c_c()
// // // //     {
// // // //         System.out.println("Child class");
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         Main m1=new Main();
// // // //         m1.c_c();
// // // //         m1.p_c();
// // // //     }
// // // // }

// // // // parent class
// // // class Parent{
// // //     public void p_m(){
// // //         System.out.println("I am a parent class method");
// // //     }
// // // }
// // //  //parent - child class
// // // class Child extends Parent{
// // //     public void cc_m(){
// // //         System.out.println("I am a child class of parent");
// // //     }
// // // }

// // // //child - child class
// // // public class Inheri extends Child
// // // {
// // //     public void c_m(){
// // //         System.out.println("I am a Mini child class of child class");
// // //     }
// // // 	public static void main(String[] args) {
// // // // 		System.out.println("Hello World");
 
// // //         Inheri m1 = new Inheri();
// // //         m1.p_m();
// // //         m1.cc_m();
// // //         m1.c_m();
// // // 	}
// // // }

// // class GrandParent{
// //     public void gp_m(){
// //         System.out.println("I am a grand parent class method");
// //     }
// // }
 
 
// // class Parent extends GrandParent{
// //     public void p_m(){
// //         System.out.println("I am a parent class method");
// //     }
// // }
 
// // //main - child class
// // public class Inheri extends Parent
// // {
// //     public void c_m(){
// //         System.out.println("I am a child class of parent");
// //     }
// // 	public static void main(String[] args) {
 
// //         Inheri m1 = new Inheri();
// //         m1.c_m();
// //         m1.p_m();
// //         m1.gp_m();

// //         Parent p1 = new Parent();
// //         p1.p_m();
// //         p1.gp_m();
// // 	}
// // }

// class Mother {
//     public void m_m() {
//         System.out.println("I am a mother class method");
//     }
// }

// class Child1 extends Mother {
//     public void c1_m() {
//         System.out.println("I am a child class of mother");
//     }
// }

// class Child2 extends Mother {
//     public void c2_m() {
//         System.out.println("I am a second child class of mother");
//     }
// }


// public class Inheri {
//     public static void main(String[] args) {
//         Child1 m1 = new Child1();
//         m1.m_m();
//         m1.c1_m();
//         Child2 m2 = new Child2();
//         m2.m_m();
//         m2.c2_m();
//     }
// }
