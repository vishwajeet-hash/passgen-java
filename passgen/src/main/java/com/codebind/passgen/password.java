package com.codebind.passgen;
import java.util.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class password {
	
	static int n=8;

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(sc.readLine());  	
    	

        passwordGenerator password = new passwordGenerator(n);
        System.out.println(password.getPassword());
        

        
    }

    
}

class passwordGenerator{
	
	private int n;
	
	//constructor
	passwordGenerator(int data) {
		n=data;
	}
	
	
	// function to generate password
	private char[] generator() {
    	
    	if(n<4) {
    		System.out.println("your password should be of more than 4 char");
    	}
    	
    	String char_box = "!@#$%^&*()_+1234567890-=abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	
    	Random random = new Random();
    	
    	char[] pass = new char[n];
    	
    	for(int i=0; i<n; i++) {
    		pass[i] = char_box.charAt(random.nextInt(76));
    	}
    	
    	return pass;
    }
	
	//function to return password
	public String getPassword() {
		String s = new String(generator());
		return s;
		
	}
	
	
	
	
}

