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
public class NumberFromatExceptionTest {

    public static void main(String[] args) {

        System.out.println("starting point of the code...");

        System.out.println("rest of the code...");
        System.out.println("Dhaka");

        try {
            String s = "abc";
            int i = Integer.parseInt(s);//NumberFormatException 
            System.out.println("value of i is : " + i);
        } catch (ArithmeticException e) {

            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {

            e.printStackTrace();

        } catch (NullPointerException e) {

            e.printStackTrace();

        } //        catch (NumberFormatException e) {
        //
        //            e.printStackTrace();
        //
        //        } catch (Exception e) {
        //
        //            e.printStackTrace();
        //
        //        } 
        finally {
            System.out.println("Khulna");
            System.out.println("Bangladesh");
        }

        System.out.println("finally block is always executed");

    }

}
