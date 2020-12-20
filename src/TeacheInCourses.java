import java.io.Serializable;

/**
 * make objects for every teachers taht been added by admin.
 */
public class TeacheInCourses implements Serializable {
    private String username;
    private String password;
    public TeacheInCourses(String user , String pass){
        password = pass;
        username = user;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "username='" + username + '\'' +"\n"+
                ", password='" + password + '\'' +"\n"+
                '}';
    }
}
