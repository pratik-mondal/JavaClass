import java.util.Scanner;

public class _19_grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME TO GRADES CALCULATOR");
        System.out.print("\nenter your marks : ");
        float marks = input.nextFloat();
        if(marks>90 && marks<=100 ){
            System.out.print("the " + marks + " marks is a 'A' grade");
        }
        else if(marks>75 && marks<=100){
            System.out.print("the " + marks + " marks is a 'B' grade");
        }
        else if(marks>60 && marks<=100){
            System.out.print("the " + marks + " marks is a 'C' grade");
        }
        else if(marks>30 && marks<=100){
            System.out.print("the " + marks + " marks is a 'D' grade");
        }
        else if(marks<=30 ) {
            System.out.print("the " + marks + " marks is a 'F' grade");
        }
        else
            System.out.print("the number is invalid");
    }
}
