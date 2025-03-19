/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warcardgroup7;

/**
 *
 * @author khali_jwhe8us
 */
public class PasswordValidator {
    
    public static boolean isValid(String password) {
        return password.length() >= 6 && password.matches(".*[A-Z].*");
    }
    
}