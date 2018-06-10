package Inheritance;

/**
 * Created by user on 4/14/2018.
 */
public class Teacher {
    private String designation="teacher";
    private String uniName="MBSTU";

    public String getDesignation() {
        return designation;
    }

    protected void setDesignation(String designation) {
        this.designation = designation;
    }

    protected String getUniName() {
        return uniName;
    }

    protected void setUniName(String uniName) {
        this.uniName = uniName;
    }

    void does(){
        System.out.println("Teaching");
    }
}
