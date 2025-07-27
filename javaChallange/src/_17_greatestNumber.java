import java.util.Scanner;

public class _17_greatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number :");
        float num1 = input.nextFloat();
        System.out.print("enter the second number : ");
        float num2 = input.nextFloat();
        System.out.print("enter the third number : ");
        float num3 = input.nextFloat();
        if(num1>=num2 && num1 >=num3){
            System.out.print("the greatest number is : "+num1);
        }
        else if (num2>=num1 && num2>=num3){
            System.out.print("the greatest number is : "+num2);
        }
        else {
            System.out.print("the greatest number is : "+num3);
        }
    }
}
