package com.exercice2;

public class CompteBancaire {
	String titulaire;
    double solde;
    // Constructeur pour initialiser le compte
    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }
    // M�thode pour d�poser de l'argent
    public void deposer(double montant) {
        solde += montant;
        System.out.println("Montant d�pos� : " + montant + " MAD. Nouveau solde : " + solde + " MAD");
    }
    // M�thode pour retirer de l'argent
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Montant retir� : " + montant + " MAD. Nouveau solde : " + solde + " MAD");
        } else if(montant > solde) {
            System.out.println("Fonds insuffisants. Solde actuel : " + solde + " MAD");
        }
        else{
            System.out.println("Erreur !! le montant ne peut pas être négatif");
        }
    }
    // M�thode pour afficher les d�tails du compte
    public void afficherDetails() {
        System.out.println("Titulaire du compte : " + titulaire);
        System.out.println("Solde actuel : " + solde + " MAD");
    }
    
    public boolean virement(CompteBancaire autreCompte, double montant) {
        if(montant > 0 && montant <= solde) {
            autreCompte.deposer(montant);
            this.solde -= montant;
        }
        else if(montant <= 0) System.out.println("Erreur le montant ne peut pas être négatif");
        else System.out.println("Solde insuffisant");
    	return true;
    }
    
    public static void main(String[] args) {
        // Cr�ation d'un compte bancaire
        CompteBancaire compte1 = new CompteBancaire("Alice", 1000);

        // Affichage des d�tails du compte
        compte1.afficherDetails();

        // D�p�t d'argent
        compte1.deposer(500);

        // Retrait d'argent
        compte1.retirer(300);

        // Tentative de retrait sup�rieur au solde
        compte1.retirer(1500);
    }
}

