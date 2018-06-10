/**
 * Created by user on 4/14/2018.
 */
public class StaticNestedClass {

    private static String str="Learning static";

    //static class
    static class MyNestedclass{
        public void disp(){
            System.out.println(str);
        }

    }
    public void normalmethod(){
        System.out.println("I am in normal method");
    }

    public static void main(String[] args) {
        StaticNestedClass.MyNestedclass obj=new StaticNestedClass.MyNestedclass();
        obj.disp();
        StaticNestedClass obj2=new StaticNestedClass();
        obj2.normalmethod();

    }


}
