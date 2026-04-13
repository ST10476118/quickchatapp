/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qiuckchatapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Qiuckchatapp {

    public static void main(String[] args) {
        //scanner object to allow user input
       Scanner input = new Scanner(System.in);
       
       //login object to allow input validation
       Login login = new Login();
       
       //declare variables
       String firstName, lastName, username, password, cellphoneNum;
       
       //Ask user for input
       System.out.print("Please enter your first name: ");
       firstName = input.nextLine();
       
       System.out.print("Please enter your last name: ");
       lastName = input.nextLine();
       
       System.out.print("Please enter your username: ");
       username = input.nextLine();
       
       //validate
       
       if(login.checkuserName(username)){
           System.out.print("Username successfully captured. ");
       }else{
           System.out.print("Username is not correctly formatted");
       }
           
       System.out.print("Please enter your password: ");
       password = input.nextLine();
       
       //validate 
       
       if(checkPasswordComplexity(password)){
           System.out.print("Password is valid");
       }else{
           System.out.print("Password is not formatted correctly");
       }
    
       System.out.print("Please enter your cellphone number: ");
       cellphoneNum = input.nextLine();
       
       //validate
       if(login.checkCellphoneNumber(cellphoneNum)){
           System.out.print("Cellphone number succesfully added");
       }else{
           System.out.print("Cellphone number incorrectly formatted");
       }
    }

    private static boolean checkPasswordComplexity(String password) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

 
        
    
    
    }

    
     

