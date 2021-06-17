package com.nipunapps.app;

import com.nipunapps.app.interfaces.GetCharDigit;

import java.util.ArrayList;
import java.util.Random;

public class GetPassword implements GetCharDigit {

    // Default Length of password is 8
    private int length=8;
    public void setLength(int length) {
        // User can set length of password using Obj.setLenth(length)
        this.length = length;
    }

    // By default this class will use only lower and upper case for password generating
    private Boolean useLower=true, useUpper=true, useDigit=false, useSpecialChar=false;

    public GetPassword() {
    }

    public GetPassword(Boolean useLower, Boolean useUpper, Boolean useDigit, Boolean useSpecialChar) {
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

    public String generatePassword(){
        if(length<4){
            return "You must create at least 4 digit password";
        }
        char[] password=new char[length];
        Random random = new Random(System.nanoTime());

        // Collaction of categories

        ArrayList<String> charChats=new ArrayList<>();
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

        // Building the password
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

    public Boolean getUseLower() {
        return useLower;
    }

    public void setUseLower(Boolean useLower) {
        this.useLower = useLower;
    }

    public Boolean getUseUpper() {
        return useUpper;
    }

    public void setUseUpper(Boolean useUpper) {
        this.useUpper = useUpper;
    }

    public Boolean getUseDigit() {
        return useDigit;
    }

    public void setUseDigit(Boolean useDigit) {
        this.useDigit = useDigit;
    }

    public Boolean getUseSpecialChar() {
        return useSpecialChar;
    }

    public void setUseSpecialChar(Boolean useSpecialChar) {
        this.useSpecialChar = useSpecialChar;
    }
}
