import java.io.Serializable;
import java.util.ArrayList;

/**
 * creat objects when admins add students and write object in files.
 */
public class StudentInCourses implements Serializable  {
    private String username;
    private String password;
    private int average;
    private int charge;
    private ArrayList<Courses> myCourses;

    public StudentInCourses(String user , String pass){
        password = pass;
        username = user;
        average = 0;
        myCourses = new ArrayList<>();
        charge = 0;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "student{" +
                "username='" + username + '\'' +"\n"+
                ", password='" + password + '\'' +"\n"+
                '}';
    }


}
