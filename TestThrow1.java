/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author INSTRUCTOR
 */
public class TestThrow1 {

     void validate(int age) {
        if (age < 18) {
            
            throw new ArithmeticException("not valid to vote");
            //System.out.println("not valid to vote");
            //System.out.println("rest of the code...");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]) {
        //validate(13);
        TestThrow1 t=new TestThrow1();
        t.validate(10);
        
        
    }

}
