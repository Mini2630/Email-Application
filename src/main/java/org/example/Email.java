package org.example;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 8;
    private String Department;
    private String email;
    private int mailboxCap = 500;
    private String altEmail;
    private String companySuffix = "DustCommander.com";

//here we prompt the user for their name and surname.
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email Created for: " + this.firstName +" "+ this.lastName);

        this.Department = setDepartment();
//        System.out.println("Department: "+ this.Department);

        this.password = generatePassword(defaultPasswordLength);
        System.out.println("This is your password: "+ this.password);

        email = ""+firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+Department+"."+ companySuffix;
//        System.out.println("Here is your email: "+email);

    }
//here we prompt the user for which department they will be working in
    private String setDepartment(){
        System.out.println("Here are our Departments:\n1. for Sales\n2. for Accounting\n3. for Marketing\n4. for Logistics" +
                "\n5. for Human Resources\n6. for Production\n0. for None\n Enter your department code here: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return  "Accounting";
        } else if (depChoice == 3) {
            return "Marketing";
        } else if (depChoice == 4) {
            return "Logistics";
        } else if (depChoice == 5) {
            return "Human Resources";
        } else if (depChoice == 6) {
            return "Production";
        } else{
            return "";
        }
    }
//here we generate a random password for the user.
    /**
     * we first give a set of available characters that can be picked randomly from.
     * @param length here we take the given set of characters a length of how many can be picked from.
     * @return a new password after iterating through the length of the set of characters.
     */
    private String generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$&*%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int passwrd = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(passwrd);
        }
        return new String(password);
    }

    public void setMailboxCap(int Capacity) {
        this.mailboxCap = Capacity;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public void changePassword(String Password){
        this.password = password;
    }

    public int getMailboxCap() {
        return mailboxCap;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "NAME: "+firstName+" "+lastName +
                "\nDEPARTMENT: "+ Department+
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOX CAPCITY: "+mailboxCap+"mb";
    }
}
