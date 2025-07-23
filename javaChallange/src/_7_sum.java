import java.util.Scanner;

public class _7_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the first nummber : ");
        int num1 = input.nextInt();
        System.out.print("please enter the second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of the element : "+sum);

    }
}
