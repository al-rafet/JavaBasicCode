package Inheritance;

/**
 * Created by user on 4/14/2018.
 */
public class ITteacher extends Teacher {
    String mainSub="IT";

    public static void main(String[] args) {
        ITteacher obj=new ITteacher();
        Teacher obt=new Teacher();
        //obt.mainSub;
        obj.does();
        System.out.println(obj.getDesignation());



        System.out.println(obj.getUniName());
        System.out.println(obj.mainSub);
    }

}
