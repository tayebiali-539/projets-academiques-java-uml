package com.exercice4;

public class Main {
    public static void main(String[] args){
        CompteBancaire compte1 = new CompteBancaire("Said", 14000);
        CompteBancaire compte2 = new CompteBancaire("Zakaria", 1000);
        CompteBancaire compte3 = new CompteBancaire("Ahmed", 1200);
        CompteBancaire compte4 = new CompteBancaire("Fatine", 12000);

        CompteBancaire.afficherNombreCompte();
        System.out.println(compte1 + "\n"+compte2+ "\n"+compte3+ "\n"+compte4);

        compte1.retirer(1000);
        compte2.retirer(-450);
        compte3.deposer(7000);
        compte4.deposer(20000);

        System.out.println(compte1 + "\n"+compte2+ "\n"+compte3+ "\n"+compte4);


    }
}
