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
public class NullExceptionTest {

    public static void main(String[] args) {

        System.out.println("starting point of the code...");

        System.out.println("rest of the code...");
        System.out.println("Dhaka");

        try {
            String data = null;
            System.out.println(data.length());
        } catch (ArithmeticException e) {

            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {

            e.printStackTrace();
             System.out.println("Khulna");
            System.out.println("Bangladesh");
        } catch (NullPointerException e) {

            e.printStackTrace();
           
        } catch (Exception e) {

            e.printStackTrace();
        }

//        String data = null;
//        System.out.println(data.length());
    }

}
