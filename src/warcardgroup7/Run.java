/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warcardgroup7;

/**
 *
 * @author khali_jwhe8us
 */
public class Run {
    
    abstract class User {
    protected String username;
    protected String password;
    
    public User(String username, String password) {
        if (PasswordValidator.isValid(password)) {
            this.username = username;
            this.password = password;
        } else {
            throw new IllegalArgumentException("Invalid password! Password must be at least 6 characters long and contain at least one uppercase letter.");
        }
    }
    public String getUsername() { 
        return username; 
    }
    
}
}
