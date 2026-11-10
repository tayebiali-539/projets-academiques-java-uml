package com.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre age : ");
        int age = sc.nextInt();
        try {
            boolean verification = Inscription.validateAge(age);
            System.out.println("Bienvenu");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Au revoir");
        }

        sc.close();
    }
}
