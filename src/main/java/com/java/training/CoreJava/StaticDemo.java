package com.java.training.CoreJava;

public class StaticDemo {

	
	// static variable
    static int a = 10;
    static int b;
     
 // static method
    public static void m1()
    {
        System.out.println("from m1");
    }
    
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

 
    public static void main(String[] args)
    {
       System.out.println("from main");
       m1();
       System.out.println("Value of a : "+a);
       System.out.println("Value of b : "+b);
       
    }


}
