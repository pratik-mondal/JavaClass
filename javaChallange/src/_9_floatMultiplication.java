import java.util.Scanner;

public class _9_floatMultiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        double num1 = input.nextDouble();
        System.out.println("enter the second number : ");
        double num2 = input.nextDouble();
        System.out.println("the answer is : " +(num1*num2));
    }
}
