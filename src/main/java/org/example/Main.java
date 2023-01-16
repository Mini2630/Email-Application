package org.example;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("Minenhle","Dlamini");
        System.out.println(email1.showInfo());

        email1.setAltEmail("mdlamini30@gmail.com");
        System.out.println(email1.getAltEmail());

    }
}