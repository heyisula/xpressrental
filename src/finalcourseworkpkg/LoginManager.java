//KIC-DCSAI-242-F-006
//KIC-DCSAI-242-F-038
//KIC-DCSAI-242-F-040
//KIC-DCSAI-242-F-049
package finalcourseworkpkg;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class LoginManager {
    private static LoginManager instance;
    boolean isLoggedIn = false;
    private Map<String, User> users;
    
    private LoginManager() {
        users = new HashMap<>();
    }

    public static synchronized LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }
    
    public void addUser(User user) {
        users.put(user.getUsername(), user);
        
        //Saving new user 
        String filePath = "User Details Sign Up.txt";
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.append("Username: " + user.getUsername() + "\n");
            writer.append("Password: " + user.getPassword() + "\n");
            writer.append("Re-cehck Password: " + user.getpasswordRecheck() + "\n");
            writer.append("First Name: " + user.getFirstName() + "\n");
            writer.append("Last Name: " + user.getLastName() + "\n");
            writer.append("Phone: " + user.getPhone() + "\n");
            writer.append("Email: " + user.getEmail() + "\n\n");
            

            JOptionPane.showMessageDialog(null, "User saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving User: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public boolean isUserExists(String username) {
        return users.containsKey(username);
    }
    
    public boolean login(String username, String password) {
        if ("admin".equals(username) && "1234".equals(password)) {
            isLoggedIn = true;
        }
        else{
            isLoggedIn = false;
        }
        if (isUserExists(username)) {
            User user = users.get(username);
            return user.getPassword().equals(password);
        }
         
        return isLoggedIn;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void logout() {
        isLoggedIn = false;
    }
}
