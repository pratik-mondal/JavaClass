import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME PAN PORTAL \n");
        System.out.print("please enter your age : ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.print("eligible for pan card");
        }
        else{
            System.out.print("not eligible for pan card");
        }
    }
}
