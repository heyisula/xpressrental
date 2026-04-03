//KIC-DCSAI-242-F-006
//KIC-DCSAI-242-F-038
//KIC-DCSAI-242-F-040
//KIC-DCSAI-242-F-049

package finalcourseworkpkg;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class User {
    private String username;
    private String password;
    private String passwordRecheck;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    
    public User(String username, String password, String passwordRecheck, String firstName, String lastName, String phone, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.passwordRecheck= passwordRecheck;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    public String getpasswordRecheck(){
        return passwordRecheck;
    }
}
