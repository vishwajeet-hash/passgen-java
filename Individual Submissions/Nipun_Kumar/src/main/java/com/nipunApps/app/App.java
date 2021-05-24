package com.nipunApps.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    //    Driver Class
    public static void main(String[] args) {

        // This is the basic output of a java file 

        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);

//        Get the length of password
        System.out.println("Enter the length of password");
        int length = sc.nextInt();

        if (length > 3) {
            Boolean lowerCase=false, upperCase=false, Digit=false, SpecialChar=false;

//        Get from user he/she want to use lower case or not
            System.out.println("Do you want to use lower Case type 'true' or 'false'");
            lowerCase = sc.nextBoolean();

//        Get from user he/she want to use upper case or not
            System.out.println("Do you want to use upperCase Case type 'true' of 'false'");
            upperCase = sc.nextBoolean();

//        Get from user he/she want to use Digit or not
            System.out.println("Do you want to use Digits type 'true' of 'false'");
            Digit = sc.nextBoolean();

//        Get from user he/she want to use Special char or not
            System.out.println("Do you want to use Special Char type 'true' of 'false'");
            SpecialChar = sc.nextBoolean();

//        call the password generator class
            GetPassword getpassword = new GetPassword(lowerCase, upperCase, Digit, SpecialChar);
//        get the password in a string using generate password method in getpassword class
            String password = getpassword.generatePassword(length);
            System.out.println(password);
        } else {
            System.out.println("You Must Generate atleast 4 Digit password");
        }
    }
}


