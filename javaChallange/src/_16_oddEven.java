import java.util.Scanner;

public class _16_oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.print("the number is even");
        } else{
            System.out.print("the number is odd");
        }
    }
}
