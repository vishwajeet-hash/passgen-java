package com.chillyfacts.passgen;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static void printArray(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
	private static char randomCharacter() {
        int rand = (int)(Math.random()*62);
        if(rand <= 9) {
            int number = rand + 48;
            return (char)(number);
        } else if(rand <= 35) {
            int uppercase = rand + 55;
            return (char)(uppercase);
        } else {
            int lowercase = rand + 61;
            return (char)(lowercase);
        }
    }

    public static void main( String[] args )
    {
    	System.out.println("Enter no. of passwords you want to generate");
        Scanner sc= new Scanner(System.in);
        int total = sc.nextInt();
        System.out.println("Enter length of password");
        int length=sc.nextInt();
        String[] randomPasswords = new String[total];


        for(int i = 0; i < total; i++) {
            String randomPassword = "";
            //Randomly generate a character for the password length number of times
            for(int j = 0; j < length; j++) {
                //Add a random lowercase or UPPERCASE character to our randomPassword String
                randomPassword += randomCharacter();
            }
            //Add the random password to your array
            randomPasswords[i] = randomPassword;
        }
        printArray(randomPasswords);

    
        
    }
}
