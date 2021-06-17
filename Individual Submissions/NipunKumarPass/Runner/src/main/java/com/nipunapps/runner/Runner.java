package com.nipunapps.runner;

import com.nipunapps.library.GetPassword;

public class Runner {
    public static void main(String[] args) {
//        when we directly call the password generator class it will return a 8
//        digit upper and lower case password	
    	
    	GetPassword getPassword=new GetPassword();
    	String defaultPassword=getPassword.generatePassword();
    	System.out.println("Password with default constructor : "+defaultPassword);
    	
//    	GetPassword class can recieve 4 constructor of boolean useUpper,useLower,useNumber and useSpecialChar
    	
    	GetPassword cgetPass=new GetPassword(true,true,true,false);
    	
    	String pass_without_specialChar=cgetPass.generatePassword(); // the length of password is currently 8
    	System.out.println("Password without special char : "+pass_without_specialChar);
    	
//    	We can set length of password by calling method setlength
    	cgetPass.setLength(10);
    	String password_of_length_10=cgetPass.generatePassword();
    	System.out.println("Password with length of 10 : "+password_of_length_10);
    	
//    	We can set the cases used in generating the password like this

		cgetPass.setUseSpecialChar(true);
		cgetPass.setUseDigit(false);
		cgetPass.setUseUpper(false);
		String pass=cgetPass.generatePassword();
		System.out.println("Password with lower and special char : "+pass);
    }
}
