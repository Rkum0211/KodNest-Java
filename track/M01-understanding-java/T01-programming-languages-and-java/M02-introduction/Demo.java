public class Demo {
    static int count = 0;

    Demo() {
        count++;
    }
}

class Demo1 {
    public static void main(java.lang.String[] args) {
        new Demo();
        new Demo();
        new Demo();
        System.out.println("Num of object: " + Demo.count);
    }
}