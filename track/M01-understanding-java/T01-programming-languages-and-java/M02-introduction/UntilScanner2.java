import java.util.Scanner;

public class UntilScanner2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();
        System.out.println("Age is " + age);
        System.out.println("Enter your name : ");
        String name = scan.next();
        System.out.println("Name is " + name);
        System.out.println("Enter your height : ");
        double height = scan.nextDouble();
        System.out.println("Height is " + height);
        System.out.println("Enter your gender : ");
        char gender = scan.next().charAt(0);
        System.out.println("Gender is " + gender);
        System.out.println("Enter your weight : ");
        double weight = scan.nextDouble();
        System.out.println("Weight is " + weight);
        System.out.println("Enter your bmi : ");
        double bmi = scan.nextDouble();
        System.out.println("BMI is " + bmi);
        System.out.println("Enter your age : " + age);
        System.out.println("Enter your name : " + name);
        System.out.println("Enter your height : " + height);
        System.out.println("Enter your gender : " + gender);
        System.out.println("Enter your weight : " + weight);
        System.out.println("Enter your bmi : " + bmi);


        
    }
    
}
