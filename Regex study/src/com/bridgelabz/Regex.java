package com.bridgelabz;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        UserRegistrationRegex regex=new UserRegistrationRegex();
        Scanner scanner=new Scanner(System.in);

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

        System.out.println("\nPassword Rule1 – minimum 8 Characters");
        System.out.println("Enter Password:");
        String password = scanner.next();
        regex.validatePassword(password);


        }
    }


