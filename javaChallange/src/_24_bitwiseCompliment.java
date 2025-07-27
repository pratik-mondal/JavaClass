import java.util.Scanner;

public class _24_bitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the nummber : ");
        int num = input.nextInt();
        int result = ~ num;
        System.out.print("result is : " + result);
    }
}
