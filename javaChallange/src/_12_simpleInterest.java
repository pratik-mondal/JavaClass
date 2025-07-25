import java.util.Scanner;

public class _12_simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the principle : ");
        float p = input.nextFloat();
        System.out.print("Please enter the time : ");
        float t = input.nextFloat();
        System.out.print("Please enter the rate : ");
        float r = input.nextFloat();
        float sh = (p*t*r)/100;
        System.out.println("Simple interest : "+sh);
    }
}
