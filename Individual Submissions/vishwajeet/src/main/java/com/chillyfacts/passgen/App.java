package com.chillyfacts.passgen;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.util.*;
//import java.io.*;
import java.util.concurrent.TimeUnit;
public class App 
{
	private static char[] passgen(int l) throws InterruptedException
    {
        System.out.println("Generating password using random...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Your new password is:");
        String special="!@#$%^&*_=+-/.?<>";
        String capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String digits="0123456789";

        String mix=special + capital +  small + digits;
        
        //using random method
        Random variable=new Random();
       char[] newpass=new char[l];
        for(int i=0;i<l;i++)
        {
             newpass[i]=mix.charAt(variable.nextInt(mix.length()) );
        }
        String myString = String. valueOf(newpass);
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        return newpass;

    }
    public static void main( String[] args ) throws InterruptedException
    {
    	
        
        try {
        if(args[0].equals("-g"))
        {
            int length=8;
            System.out.println(passgen(length));
           
        }
        else if(args[0].equals("-l"))
        {
        	int length=Integer.parseInt(args[1]);
        	if(length<4)
        	help();
        	else
        	System.out.println(passgen(length));
        }
        else
        {
        	System.out.println("passgen -g  ");
        	System.out.println("passgen -l  ");
            System.out.println("-g :generates a default password of length 8");
            System.out.println("-l :generates password of a length that you want but it should be greater than 4.");
            System.out.println("passgen --help : To know the commands");
            System.out.println("passgen.jar -g "  );
            System.out.println("It will generate a default Password of length 8");
            System.out.println("passgen.jar -l 6 "  );
            System.out.println("It will generate a Password of length 6");
        }
        }
        catch (Exception e){
        	System.out.println("passgen -g  ");
        	System.out.println("passgen -l  ");
            System.out.println("-g :generates a default password of length 8");
            System.out.println("-l :generates password of a length that you want but it should be greater than 4.");
            System.out.println("passgen --help : To know the commands");
            System.out.println("passgen.jar -g "  );
            System.out.println("It will generate a default Password of length 8");
            System.out.println("passgen.jar -l 6 "  );
            System.out.println("It will generate a Password of length 6");
        }
         
    }
    public static void help() {
    	System.out.println("passgen -g  ");
    	System.out.println("passgen -l  ");
        System.out.println("-g :generates a default password of length 8");
        System.out.println("-l :generates password of a length that you want but it should be greater than 4.");
        System.out.println("passgen --help : To know the commands");
        System.out.println("passgen.jar -g "  );
        System.out.println("It will generate a default Password of length 8");
        System.out.println("passgen.jar -l 6 "  );
        System.out.println("It will generate a Password of length 6");
    }
}
