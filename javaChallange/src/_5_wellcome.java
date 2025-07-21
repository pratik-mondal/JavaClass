import java.util.Scanner;

public class _5_wellcome {
    public static void main(String[] args) {
        System.out.print("please enter your name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("wellcome " + name+" coding world");
    }
}
