import java.util.Scanner;

public class UntilScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter byte value : ");
        byte b= scanner.nextByte();
        System.out.println("byte value is " +b);

        System.out.println("Enter shot value : ");
        short s= scanner.nextShort();
        System.out.println("short value is " +s);

        System.out.println("Enter int value : ");
        int i= scanner.nextInt();
        System.out.println("int value is " +i);

        System.out.println("Enter long value : ");
        long l= scanner.nextLong();
        System.out.println("long value is " +l);

        System.out.println("Enter float value : ");
        float f= scanner.nextFloat();
        System.out.println("float value is " +f);

        System.out.println("Enter double value : ");
        double d= scanner.nextDouble();
        System.out.println("double value is " +d);

        System.out.println("Enter char value : ");
        char c= scanner.next().charAt(0);
        System.out.println("char value is " +c);

        System.out.println("Enter boolean value : ");
        boolean bo= scanner.nextBoolean();
        System.out.println("boolean value is " +bo);

        scanner.close();
    }
}
