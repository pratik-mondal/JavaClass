import java.util.Scanner;

public class _23_bitwiseXor {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter the first number : ");
            int num1 = input.nextInt();
            System.out.print("please enter the second number : ");
            int num2 = input.nextInt();
            int cal = num1 ^ num2 ;
            System.out.print("result is : "+ cal);
    }
}
