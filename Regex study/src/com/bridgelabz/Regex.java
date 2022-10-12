package com.bridgelabz;

import javax.management.DynamicMBean;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Regex regex = new Regex();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name :");
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        regex.validateFirstName(firstName);
        regex.validateName(firstName);

        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        regex.validateName(lastName);
    }

    public void validateFirstName(String firstName) {
//        first name starts with Cap and has minimum 3 characters
        public void validateName (String name){
//        firstName or lastName starts with Cap and has minimum 3 characters
            Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
            boolean matches = pattern.matcher(firstName).matches();
            boolean matches = pattern.matcher(name).matches();
            if (matches) {
                System.out.println("firstName is valid");
                System.out.println(name + " is valid");
            } else
                System.out.println("firstName is not valid");
            System.out.println(name + " is not valid");


        }
    }
}
