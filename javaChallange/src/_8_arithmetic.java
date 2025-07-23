import java.util.Scanner;

public class _8_arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first element : ");
        int num1 = input.nextInt();
        System.out.print("enter the second element : ");
        int num2 = input.nextInt();
        int add = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        float div =(float) num1 / num2;
        int mod = num1 % num2;
        System.out.print("sum of the result : "+add);
        System.out.print("\nsubtract of the result : "+sub);
        System.out.print("\nmultiplication of the result : "+multi);
        System.out.print("\ndivide of the result : "+div);
        System.out.print("\nmodulus of the result : "+ mod);



    }
}
