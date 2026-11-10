package com.exercice3;

public class Calculatrice {
    //addition
    public static   double additionner(double a, double b){
        return a + b;
    }
    // soustraction
    public static   double soustraire(double a, double b){
        return a - b;
    }
    // multiplication
    public static   double multiplier(double a, double b){
        return a * b;
    }
    //division
    public static double diviser(double a, double b){
        return b==0?0:a/b;
    }
    //puissance
    public static  double calculerPuisance(double a, double b){
        return Math.pow(a,b);
    }
    //modulo
    public static  double calculerModulo(double a, double b){
        return b==0?0:a%b;
    }
}
