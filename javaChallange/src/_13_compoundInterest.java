import java.util.Scanner;

public class _13_compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the principal : ");
        float p = input.nextFloat();
        System.out.print("Please enter the Rate : ");
        float r = input.nextFloat();
        System.out.print("please enter the Time : ");
        float t = input.nextFloat();
        float amount = (float) (p* Math.pow((1+(r/100)),t));
        System.out.println("The Amount Is : " +amount);
    }
}
