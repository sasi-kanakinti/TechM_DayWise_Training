

//Autoboxing

// class Main {

// public static void main(String[] args) {

// int i = 10;

// Integer integer = i; // Autoboxing

// System.out.println("Value of integer: " + integer);

// }

// }
 
 
//Unboxing

class MainBoxing {

public static void main(String[] args) {

@SuppressWarnings("deprecation")
Integer integer = new Integer(10);

int i = integer; // Unboxing

System.out.println("Value of i: " + i);

}

}
 