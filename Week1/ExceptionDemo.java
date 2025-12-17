import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;
import exceptions.InvalidMarks;

public class ExceptionDemo {
    public static void divideByZero(){
        Scanner sc = new Scanner(System.in);
        int a = 10, b = 0;
        System.out.println("Enter a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("error: " + e);
            System.out.println(a/b);
            System.out.println("Not printed");
        }finally {
            System.out.println("In divide by zero Finally block");
        }
    }

    public static void arrayOutOfBound(){
        try {
            int[] arr = new int[10];
            System.out.println(arr[20]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }
    }

    public static void nullErr(){
        try {
            String s1 = null;
            System.out.println(s1.length());
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }

    public static void checkMarks(Scanner sc){
        System.out.print("Enter marks: ");
        int m = sc.nextInt();
        if (m < 35){
//            throw new IllegalArgumentException("Invalid. Marks should be >35");
            throw new InvalidMarks("Invalid Marks (<35)");
        }
    }







    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
//        divideByZero();
//        arrayOutOfBound();
//        nullErr();
        checkMarks(sc);
        }catch (ArithmeticException e){
            System.out.println("Main Exception");
            System.out.println(e);
        }catch (IllegalArgumentException e){
//            System.out.println("Main Exception");
            System.out.println(e);
        }catch (InvalidMarks e){
            System.out.println(e);
        }
    }
}
