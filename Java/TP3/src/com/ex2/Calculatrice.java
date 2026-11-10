package com.ex2;

public class Calculatrice {
    public static double division(double a, double b) throws DivisionZeroException {
        if(b==0) throw new DivisionZeroException("Erreur : division par zero");

        return a/b;
    }
}
