import java.util.Scanner;

public class _20_ageGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("WELLCOME TO OUR AGE CALSSIFICATION CALCULATOR");
        System.out.print("\nplease enter your age : ");
        int age = input.nextInt();
        if(age<=13 && age<=100){
            System.out.print(" the age is preference 'child'");
        } else if(age<=20 && age<=100) {
            System.out.print(" the age is preference 'teen'");
        }
        else if (age<=60 && age<=100) {
            System.out.print(" the age is preference 'adult'");
        }
        else if (age>60 && age<=100) {
            System.out.print(" the age is preference 'senior'");
        }
        else{
            System.out.print("gennerally out of hundred age is died in kaliyug ");
        }
    }
}
