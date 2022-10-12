package com.bridgelabz;


import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //        firstName or lastName starts with Cap and has minimum 3 characters
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
        boolean isValid = pattern.matcher(name).matches();
        if (isValid) {
            System.out.println(name + " is valid");
        } else
            System.out.println(name + " is not valid");
    }

    public void validateEmail(String email) {
/*        E.g. abc.xyz@bl.co.in
        Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
        with precise @ and . positions
 */
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*@([a-z]+)([.][a-z])*(\\.[a-z]+)$");
        boolean isValid = pattern.matcher(email).matches();
        if (isValid) {
            System.out.println("email is valid");
        } else
            System.out.println("email is not valid");
    }

    public void validateMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile("^[\\d]{2}\\s[\\d]{10}$");
        boolean isValid = pattern.matcher(mobileNo).matches();
        if (isValid) {
            System.out.println("mobile is valid");
        } else {
            System.out.println("mobile is not valid");
        }
    }

    public void validatePassword(String password) {
        boolean isValid = true;
        validatePassRule1(password);
        validatePassRule2(password);
        validatePassRule3(password);
    }

    boolean validatePassRule1(String password) {
        void validatePassRule1 (String password){
            //minimum 8 characters
            Pattern pattern = Pattern.compile("[\\S]{8,}");
            Boolean isValid = pattern.matcher(password).matches();
            if (isValid) {
                System.out.println("Rule1 Pass...");
            } else {
                System.out.println("Invalid Password! \nPassword must have minimum 8 characters");
                System.out.println("Invalid Password! =>Password must have minimum 8 characters");
            }
            return isValid;
        }

        boolean validatePassRule2 (String password){
            void validatePassRule2 (String password){
                //aAt least one upperCase letter
                Pattern pattern = Pattern.compile("(?=.*[A-Z])[\\S]{8,}");
                Boolean isValid = pattern.matcher(password).matches();
                if (isValid) {
                    System.out.println("Rule2 Pass...");
                } else {
                    System.out.println("Invalid Password! \npassword must have at least one uppercase letter");
                    System.out.println("Invalid Password! => password must have at least one uppercase letter");
                }
            }
            void validatePassRule3 (String password){
                //aAt least one upperCase letter
                Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])[\\S]{8,}");
                Boolean isValid = pattern.matcher(password).matches();
                if (isValid) {
                    System.out.println("Rule3 Pass...");
                } else {
                    System.out.println("Invalid Password! => password must have at least numeric letter");
                }
                return isValid;


            }
        }
    }
}


