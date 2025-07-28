import java.util.Scanner;

public class Parameter {

    public static void main(String[] args) {
        greet();
       int result =calculator();
        System.out.println("the result is : "+result);
    }


    public static void greet(){
        System.out.print("WELLCOME TO YOUR CALCULATOR\n");                    // greet code
    }


    public static int integer1(){
        Scanner input = new Scanner(System.in);                               // input code
        System.out.print("please enter the number : ");
        int num =  input.nextInt();
        return num;
    }

    public static int calculator(){
       int cal =integer1()+integer1();                                         // result part
       return cal;

    }

}