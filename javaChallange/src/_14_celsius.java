import java.util.Scanner;

public class _14_celsius {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);
        System.out.print("Enter the fahrenheit degree : ");
        float f = innput.nextFloat();
        float c = (f-32)*5/9;
        System.out.println("celsius degree is : " +c);
    }
}
