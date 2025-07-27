import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = calculator();
        int second = calculator();
        System.out.print("the result is : "+(first+second));
    }
    public static int calculator(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number : ");
        int num1 = input.nextInt();
        return num1;
    }

    public static void greet(){
        System.out.print("WLLCOME TO CALCULATOR\n\n");
    }
}
