package com.exercice4;

public class CompteBancaire {
    private String nomTitulaire;
    private double solde;
    public static final double TAUX_INTERET = 0.03;
    public static int nombreCompte=0;

    public CompteBancaire(String nomTitulaire, double solde) {
        this.nomTitulaire = nomTitulaire;
        this.solde = solde;
        nombreCompte++;
    }

    public void deposer(double montant){
        this.solde+=montant;
    }

    public boolean retirer(double montant){
        if(montant<=0) {
            System.out.println("La valeur du montant est incorrrecte");
            return false;
        }
        if(montant > solde){
            System.out.println("Solde insuffisant");
            return false;
        }
        this.solde-=montant;
        return true;
    }

    public void calculerInteret(){
        this.solde+=this.solde*TAUX_INTERET;
    }

    public static void afficherNombreCompte(){
        System.out.println(nombreCompte);
    }

    @Override
    public String toString() {
        return  nomTitulaire + ' '  + solde ;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
