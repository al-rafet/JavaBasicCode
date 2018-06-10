package Aggregation;

/**
 * Created by user on 4/17/2018.
 */
public class Studentclass {
    int idno;
    String stName;
    Address stAddress;

    public Studentclass(int idno, String stName, Address stAddress) {
        this.idno = idno;
        this.stName = stName ;
        this.stAddress = stAddress;
    }

    public static void main(String[] args) {
        Address ad=new Address(101,"Kushtia","Khulna","Bangladesh");
        Studentclass st=new Studentclass(13016,"Md. Al Refat",ad);
        System.out.println("Name : "+st.stName);
        System.out.println("ID : "+st.idno);
        System.out.println("StreeNO : "+st.stAddress.streetnum);
        System.out.println("City : "+st.stAddress.city);
        System.out.println("State : "+st.stAddress.state);
        System.out.println("Country : "+st.stAddress.country);
    }



}
