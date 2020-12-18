import java.io.Serializable;

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
