package exception;

public class Testtrycatch1 {

    public static void main(String args[]) {
        System.out.println("starting point of the code...");

        System.out.println("rest of the code...");
        System.out.println("Dhaka");
        int data = 10;
        try {
            data = 50 / 0;//may throw exception
        } catch (ArithmeticException e) {

            e.printStackTrace();
        }
        //int data = 50 / 0;//may throw exception
        System.out.println(data);
        System.out.println("Khulna");
        System.out.println("Bangladesh");

    }

}
