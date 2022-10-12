package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Regex regex = new Regex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        regex.validateName(firstName);
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        regex.validateName(lastName);
        System.out.println("Enter email: ");
        String email = scanner.next();
        regex.validateEmail(email);

        System.out.println("Enter mobile no as per format: (e.g. 91 9867859848) ");
        String mobileNo = scanner.nextLine();
        regex.validateMobileNo(mobileNo);
    }

    public void validateName(String name) {
//        firstName or lastName starts with Cap and has minimum 3 characters
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
        boolean matches = pattern.matcher(name).matches();
        if (matches) {
            System.out.println(name + " is valid");
        } else
            System.out.println(name + " is not valid");
    }

    public void validateEmail(String email) {
/*        E.g. abc.xyz@bl.co.in
        Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
        with precise @ and . positions
 */
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+ ([._-][a-zA-Z0-9]+)* @ [a-z]+ ([.][a-z])* ([.][a-z]+)$");
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*@([a-z]+)([.][a-z])*(\\.[a-z]+)$");
        boolean matches = pattern.matcher(email).matches();
        if (matches) {
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
}

