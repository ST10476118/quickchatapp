/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qiuckchatapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
class Login {
    
    //method to validate the username
    boolean checkuserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
    //method that validates the phone number
    boolean checkCellphoneNumber(String cellphonenumber){
        
        //declare a varibale to store the pattern
        String regex = "^(\\+27|0)[6-8][0-9](8)$";
        
        //pattern object to compile regex pattern
        Pattern pattern = Pattern.compile(regex);
        
        //matcher object to compare the cellphone to the pattern
        Matcher matcher = pattern.matcher(cellphonenumber);
        
        //return true if cellphone number mathes pattern
        return matcher.matches();
    }
        
    public boolean checkPasswordComplexity(String password)
    {
        if(password.length()<8){
            return false;
        }
    boolean hasUppercase = false;
    boolean hasDigit = false;
    boolean hasSpecial = false;
    for(int i =0; i < password.length();i++){
        char ch = password.charAt(i);
        if (Character.isUpperCase(ch)){
            hasUppercase = true;
        }else if(Character.isDigit(ch)){
            hasDigit = true;
        }else if (Character.isLetterOrDigit(ch)){
            hasSpecial = true;
        }
        return hasUppercase && hasDigit && hasSpecial;
    }
        return false;
        } 
    //method to return login status
    public boolean loginUser(String username , String password){
        return storedUsername.equals(username) && storedPassword.equals(password);
    }
   public String returnLoginStatus(String username, String password){
       if (loginUser(username, password)){
           String firstName = null;
           String lastName = null;
           return "Welcome " + firstName + "," + lastName + "good to see you again";
                   }else{
           
       }
        return "Username or password incorrect, please try again";
   }
}            
    

