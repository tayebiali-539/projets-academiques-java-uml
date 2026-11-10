package com.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le premier nombre : ");
        double a = sc.nextDouble();
        System.out.println("Saisir le deuxieme nombre : ");
        double b = sc.nextDouble();
        try{
            System.out.println("Le resultat est :"+Calculatrice.division(a,b));
        }catch (DivisionZeroException d){
            System.out.println(d.getMessage());
        }

    }
}
