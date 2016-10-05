/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexample;

/**
 *
 * @author user2
 */
public class TestExample {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //C obj=new C();
       //obj.test();
       
       //We cannot directly call a method in C from a method in A 
       //without vreating an object of C
       //without using the variables in B because 
       //class A is extending both B and C
       //what we can do use super keyword in all the 3 classes 
       //and by using super keyword we can call test() method in B from C and
       //method in B will in turn call test() method in a in A
    } 
}

//SuperClass C
class C{
    
    public void test(){
        System.out.println("DOG");
        
    }
}
//Child class B which extends(inherits) C
class B extends C{
    
    public void test(){
        //super.test();//used to invoke the superclass method or constructor
        System.out.println("CAT");  
    }
}

//Child class A which extends(inherits) B 
//which in turn inherits from SuperClass C
// A==(Properties and behavior) of B+C

class A extends B{
    
    public void test(){
        
        //super.test();//used to invoke the superclass method or constructor 
    }
}


//Result= f.it is not possible to invoke test() method defined in C from a test() method in A
//without Accessing the test() method from B class.

    