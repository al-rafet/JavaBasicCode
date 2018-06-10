package Inheritance;

/**
 * Created by user on 4/16/2018.
 */
public class JavaExample extends ParentClass {

    JavaExample(){
        System.out.println("Constructor of child");
    }
    void disp(){
        System.out.println("Child method");
        //super.disp();
    }
    void jvxmpl(){
        System.out.println("2nd derived class");
    }

    public static void main(String[] args) {
        //creating object of child class
        JavaExample obj=new JavaExample();
        //ParentClass pr=new ParentClass();
        //pr.disp();
        obj.disp();
    }

}
