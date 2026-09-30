public class Inheritence01 {
    int a = 10;
    void display(){
        System.out.println("The value of a is: " + a);
    }
}

class child extends Inheritence01{
    void display1(){
        System.out.println("The value of a is: " + a);
    }            
}
