package com.nipunapps.runner;

import com.nipunapps.library.GetPassword;

public class Runner {
    public static void main(String[] args) {
////        when we directly call the password generator class it will return a 8
////        digit upper and lower case password
//
//    	GetPassword getPassword=new GetPassword();
//    	String defaultPassword=getPassword.generatePassword();
//    	System.out.println("Password with default constructor : "+defaultPassword);
//
////    	GetPassword class can receive 4 constructor of boolean useUpper,useLower,useNumber and useSpecialChar
//
//    	GetPassword cgetPass=new GetPassword(true,true,true,false);
//
//    	String pass_without_specialChar=cgetPass.generatePassword(); // the length of password is currently 8
//    	System.out.println("Password without special char : "+pass_without_specialChar);
//
////    	We can set length of password by calling method setlength
//    	cgetPass.setLength(10);
//    	String password_of_length_10=cgetPass.generatePassword();
//    	System.out.println("Password with length of 10 : "+password_of_length_10);
//
////    	We can set the cases used in generating the password like this
//
//		cgetPass.setUseSpecialChar(true);
//		cgetPass.setUseDigit(false);
//		cgetPass.setUseUpper(false);
//		String pass=cgetPass.generatePassword();
//		System.out.println("Password with lower and special char : "+pass);

		int length;
		GetPassword passwordGenerator=new GetPassword();
		try{
			if(args.length==0) {
				System.out.println("The password is : " + passwordGenerator.generatePassword() + "\n\n");

				help();
			}
			else if(args.length==1) {
				 if (args[0].equals("-h")) {
					printHelp();
				} else {
					String strlen = args[0];
					length = Integer.parseInt(strlen.substring(1));
					passwordGenerator.setLength(length);
					System.out.println("The password is : " + passwordGenerator.generatePassword());
				}
			}
			else{
				String strlen = args[0];
				length = Integer.parseInt(strlen.substring(1));
				passwordGenerator.setLength(length);
					if(args[1].length()!=5){
						help();
					}
					else {
						String bool=args[1].substring(1);
						if(bool.charAt(0)=='t' || bool.charAt(0)=='T'){
							passwordGenerator.setUseLower(true);
						}
						else if(bool.charAt(0)=='f' || bool.charAt(0)=='F') {
							passwordGenerator.setUseLower(false);
						}
						else {
							help();
						}

						if(bool.charAt(1)=='t' || bool.charAt(1)=='T'){
							passwordGenerator.setUseUpper(true);
						}
						else if(bool.charAt(1)=='f' || bool.charAt(1)=='F') {
							passwordGenerator.setUseUpper(false);
						}
						else {
							help();
						}
						if(bool.charAt(2)=='t' || bool.charAt(2)=='T'){
							passwordGenerator.setUseDigit(true);
						}
						else if(bool.charAt(2)=='f' || bool.charAt(2)=='F') {
							passwordGenerator.setUseDigit(false);
						}
						else {
							help();
						}
						if(bool.charAt(3)=='t' || bool.charAt(3)=='T'){
							passwordGenerator.setUseSpecialChar(true);
						}
						else if(bool.charAt(3)=='f' || bool.charAt(3)=='F') {
							passwordGenerator.setUseSpecialChar(false);
						}
						else {
							help();
						}
						
						System.out.println("The password is : " + passwordGenerator.generatePassword());
					}
				

			}
		}catch (ArithmeticException e) {

			System.out.println("** minimum password length supported is 4 **");
			help();

		}catch (ArrayIndexOutOfBoundsException e) {
			help();
		} catch (Exception e) {

			help();

		}

	}
	public static void help(){
    	System.out.println("Type\t java -jar nipunpassgen.jar -h\t for mor help");
    	System.exit(0);
	}
	public static void printHelp(){
    	System.out.println("\n\n\t\t\t ----HELP---\n\n");
    	System.out.println("You can set the length of password like this \n\t java -jar nipunpassgen.jar -l  (where l is length of password) \n\n ");
    	System.out.println("You can also specifiy the which type of word your want to use like this-->");
    	System.out.println("\t Type java -jar nipunpassgen.jar -l -tttt \n Here 1st t will set uselowercase true  \t 2nd t set useUppercase true");
    	System.out.println("\t 3rd t set useDigit True \t and 4th t set useSpecial Char true");
    	System.out.println("You can use 't' or 'T' for setting the true and 'f' or 'F' for setting the true\n");


	}
}
