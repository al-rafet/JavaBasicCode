

/**
 * Created by user on 4/13/2018.
 */
public class SimpleStaticExample {
    static {
        System.out.println("I am in static block");
    }
    public static void myMethod(){
        System.out.println("This is inside static method");
    }
    static{
        myMethod();
    }

    public static void main(String[] args) {
        //myMethod();
        //myMethod2();
    }

    /*public void myMethod2(){
        myMethod();
    }*/
}
