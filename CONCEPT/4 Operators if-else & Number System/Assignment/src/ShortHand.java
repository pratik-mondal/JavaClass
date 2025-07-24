import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 10;
        System.out.print("please enter your number : ");
        int num2 = input.nextInt();
        num1 += num2; // num1 = num1 + num2 ; this line are same
        System.out.println("sum :" +num1);
    }
}
