import java.util.Scanner;

public class _10_perimeterOfaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the lenght ONE SIDE : ");
        float s1 = input.nextFloat();
        System.out.print("please enter the lenght SECOND SIDE : ");
        float s2 = input.nextFloat();
        System.out.print("please enter the lenght THIRD SIDE : ");
        float s3 = input.nextFloat();
        System.out.print("please enter the lenght FOURTH SIDE : ");
        float s4 = input.nextFloat();
        float cal = s1 +s2 +s3 +s4 ;
        System.out.print("perimeter of a rectangle : "+cal);
    }
}
