import java.util.Scanner;

public class _11_areaOfaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base : ");
        float base = input.nextFloat();
        System.out.print("Enter the hight : ");
        float hight = input.nextFloat();
        float cal =  (0.5f)*base*hight;
        System.out.println("Area of the triangle : " +cal);
    }
}
