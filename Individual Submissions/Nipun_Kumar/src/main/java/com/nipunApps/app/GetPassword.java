package com.nipunApps.app;

import java.util.ArrayList;
import java.util.Random;

public class GetPassword implements GetCharDigit {
    //    PasswordGenerator Class
    private Boolean useLower, useUpper, useDigit, useSpecialChar;

    public GetPassword() {
    }

    public GetPassword(Boolean useLower, Boolean useUpper, Boolean useDigit, Boolean useSpecialChar) {
//        This constructor is simply taking the value from user that what type of character he want to use for their password
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
    public String lowercase() {
        return "abcdefghijklmnopqrstuvwxyz";
    }

    @Override
    public String getSpecialChar() {

        return "!@#$%^&*()_+~?";
    }

    @Override
    public String getUpperCase() {
        String upperCase = lowercase().toUpperCase();
        return upperCase;
    }

    public String generatePassword(int length) {
        if (length <= 3) {
            return "You Must generate a password atleast 4 Digit ";
        }
        char[] password = new char[length];
        Random random = new Random(System.nanoTime());
//        Collecting the categories to use
        ArrayList<String> charCategories = new ArrayList<>(4);
        if (useLower) {
            charCategories.add(lowercase());
        }
        if (useUpper) {
            charCategories.add(getUpperCase());
        }
        if (useDigit) {
            charCategories.add(getDigit());
        }
        if (useSpecialChar) {
            charCategories.add(getSpecialChar());
        }

        // Build the password.
        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password[i] = (charCategory.charAt(position));
        }
        return new String(password);
    }
}
