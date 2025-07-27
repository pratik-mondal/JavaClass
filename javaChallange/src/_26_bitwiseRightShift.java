import java.util.Scanner;

public class _26_bitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the nummber : ");
        int num = input.nextInt();
        int result = num >> 1;
        System.out.print("result is : " + result);
    }
}
