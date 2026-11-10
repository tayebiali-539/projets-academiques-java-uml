package com.exercice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double a=0, b=0;
        Scanner scanner = new Scanner(System.in);
        int choix=0;
        do{
            System.out.println("Saisir :" +
                    "1 : saisir les deux nombres\n"+
                    "2: calculer l'addition\n"+
                    "3: calculer la soustraction\n"+
                    "4: calculer la multiplication\n"+
                    "5: calculer la division\n"+
                    "6: calculer la puissance\n"+
                    "7: calculer le modulo\n"+
                    "0: Quitter");
            choix = scanner.nextInt();
            switch (choix){
                case 1-> {
                    System.out.println("Saisir le 1er nombre");a = scanner.nextDouble();
                    System.out.println("Saisir le 2éme nombre");b = scanner.nextDouble();
                }
                case 2 -> System.out.println("Le résultat est :"+ Calculatrice.additionner(a,b));
                case 3 -> System.out.println("Le résultat est :"+Calculatrice.soustraire(a,b));
                case 4 -> System.out.println("Le résultat est :"+Calculatrice.multiplier(a,b));
                case 5 -> System.out.println("Le résultat est :"+Calculatrice.diviser(a,b));
                case 6 -> System.out.println("Le résultat est :"+Calculatrice.calculerPuisance(a,b));
                case 7 -> System.out.println("Le résultat est :"+Calculatrice.calculerModulo(a,b));
            }
        }while(choix!=0);
    }
}
