class Parent {
    void display1() {
        System.out.println("Parent display1");
    }

    void display2() {
        System.out.println("Parent display2");
    }
}

class Child1 extends Parent {
    void display1() {
        System.out.println("Child1 display1");
    }

    void childDisplay1() {
        System.out.println("Child1 childDisplay1");
    }
}

class Child2 extends Parent {
    void display2() {
        System.out.println("Child2 display2");
    }

    void childDisplay2() {
        System.out.println("Child2 childDisplay2");
    }
}

public class AcessMethod {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        accessMethod(ch1);
        Child2 ch2 = new Child2();
        accessMethod(ch2);
    }

    public static void accessMethod(Parent ref) {
        ref.display1();
        ref.display2();

        if (ref instanceof Child1) {
            ((Child1) ref).childDisplay1();
        } else if (ref instanceof Child2) {
            ((Child2) ref).childDisplay2();
        }
    }
}
