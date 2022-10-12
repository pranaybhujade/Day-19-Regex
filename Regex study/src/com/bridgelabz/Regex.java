package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Regex regex=new Regex();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName=scanner.next();
        regex.validateName(firstName);
        System.out.println("Enter last name: ");
        String lastName=scanner.next();
        regex.validateName(lastName);

        System.out.println("Enter email: ");
        String email=scanner.next();
        regex.validateEmail(email);
    }

    public void validateName(String name){
        @@ -26,4 +30,16 @@ public void validateName(String name){
        }else
        System.out.println(name+" is not valid");
    }
    public void validateEmail(String email){
/*        E.g. abc.xyz@bl.co.in
        Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
        with precise @ and . positions
 */
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9]+ ([._-][a-zA-Z0-9]+)* @ [a-z]+ ([.][a-z])* ([.][a-z]+)$");
        boolean matches = pattern.matcher(email).matches();
        if (matches){
            System.out.println("email is valid");
        }else
            System.out.println("email is not valid");




        }
    }

