/**
 * Created by user on 4/13/2018.
 */
public class StaticExample2 {
    static int var1;
    String var2;

    public static void main(String[] args) {
        StaticExample2 obj1=new StaticExample2();
        StaticExample2 obj2=new StaticExample2();

       // var1=99;
        obj1.var2="I am object1";

        obj1.var1=77;
        obj2.var2="I am object2";

        System.out.println("Object1 integer: "+obj1.var1);


        System.out.println("Object1 integer: "+obj2.var1);
        System.out.println("Object1 string: "+obj2.var2);
    }

}
