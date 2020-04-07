
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {

        User myUser = new User();
        
        try {
            myUser.setEmail("test");
        }
        catch (InvalidEmailFormatException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
        
        String str = "abc";
        try 
        {
           int number = Integer.parseInt(str);
        } 
//        catch (NumberFormatException e) 
//        {
//            System.out.println(str + " is not a number.");
//        } 
//        catch (IllegalArgumentException e) //OK
//        {
//            System.out.println("Bad number format.");
//        }
        catch (Exception ex) {
            System.out.println("Can't convert " + str+ " to an int");
        }
        finally {
            System.out.println("This code happens no matter what");
        }
        
        
        
        
        

        try {
            File file = new File("MyFile.txt");
            Scanner inputFile = new Scanner(file);

            System.out.println("File opened");
        } catch (FileNotFoundException error) {
            System.out.println("Could not open file!");
            System.out.println(error.getMessage());
        }
        

    }
}
