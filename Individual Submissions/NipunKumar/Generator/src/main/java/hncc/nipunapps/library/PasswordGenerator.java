package hncc.nipunapps.library;

import java.util.ArrayList;
import java.util.Random;

import hncc.nipunapps.library.interfaces.CharDigits;

public class PasswordGenerator implements CharDigits {

    // Default Length of password is 8
    private int length=8;
    public void setLength(int length) {
        // User can set length of password using Obj.setLenth(length)
        this.length = length;
    }

    // By default this class will use only lower and upper case for password generating
    private Boolean useLower=true, useUpper=true, useDigit=true, useSpecialChar=true;

    public PasswordGenerator() {
    }

    public PasswordGenerator(Boolean useLower, Boolean useUpper, Boolean useDigit, Boolean useSpecialChar) {
        this.useLower = useLower;
        this.useUpper = useUpper;
        this.useDigit = useDigit;
        this.useSpecialChar = useSpecialChar;
    }

    @Override
    public String getDigit() {
        return "0123456789";
    }

    @Override
    public String getLowercase() {
        return "abcdefghijklmnopqrstuvwxyz";
    }

    @Override
    public String getSpecialChar() {

        return "!@#$%^&*()_+~?";
    }

    @Override
    public String getUpperCase() {
        String upperCase = getLowercase().toUpperCase();
        return upperCase;
    }

    ArrayList<String> charChats=new ArrayList<>();
    public String generatePassword(){
        if(length<4){
            return "You must create at least 4 digit password";
        }
        char[] password=new char[length];
        Random random = new Random(System.nanoTime());

        // Collection of categories
        getCharUses();
        // Building the password
        String specialChar=getSpecialChar();
        for(int i=0;i<length;i++){
            String charChat;
            if(useUpper && i==0){
                charChat=charChats.get(i);
            }
            charChat= charChats.get(random.nextInt(charChats.size()));
            password[i]=charChat.charAt(random.nextInt(charChat.length()));
        }
        // Returning the password
        return new String(password);
    }
    private void getCharUses(){
        charChats.clear();
        if(useUpper){
            charChats.add(getUpperCase());
        }
        if(useLower){
            charChats.add(getLowercase());
        }
        if(useDigit){
            charChats.add(getDigit());
        }
        if(useSpecialChar){
            charChats.add(getSpecialChar());
        }
    }
    public void setUseLower(Boolean useLower) {
        this.useLower = useLower;
    }

    public void setUseUpper(Boolean useUpper) {
        this.useUpper = useUpper;
    }

    public void setUseDigit(Boolean useDigit) {
        this.useDigit = useDigit;
    }

    public void setUseSpecialChar(Boolean useSpecialChar) {
        this.useSpecialChar = useSpecialChar;
    }
}