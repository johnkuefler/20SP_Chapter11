/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class User {
    private String email;
    private String username;
    private String password;
    private float dailyLoggedOnHours;
    
    public User() {
        this.email = "";
        this.username = "";
        this.password = "";
        this.dailyLoggedOnHours = 0;
    }
    
    public User(String email, String username, String pass, float hours) {
        this.email = email;
        this.username = username;
        this.password = pass;
        this.dailyLoggedOnHours = hours;
    }

    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     * @throws IllegalArgumentException - This exception occurs when email is null or empty
     * @throws InvalidEmailFormatException - This exception occurs when email doesn't contain @ or .
     */
    public void setEmail(String email) throws IllegalArgumentException, InvalidEmailFormatException {
        if (email.equals("") || email.equals(null)) {
            throw new IllegalArgumentException("Email must not be empty");
        }
        
        if (!email.contains("@")) {
            throw new InvalidEmailFormatException("Email must contain @");
        }
        
        if (!email.contains(".")) {
            throw new InvalidEmailFormatException("Email must contain .");
        }
        
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getDailyLoggedOnHours() {
        return dailyLoggedOnHours;
    }

    public void setDailyLoggedOnHours(float dailyLoggedOnHours) {
        this.dailyLoggedOnHours = dailyLoggedOnHours;
    }
    
    public float calculateYearlyLoggedOnHours() {
        return this.dailyLoggedOnHours * 365;
    }
}
