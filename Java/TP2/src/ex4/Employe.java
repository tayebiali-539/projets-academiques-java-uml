package ex4;

import java.util.Queue;

public class Employe {
    private int identifiant;
    private String nom, prenom;
    private Queue<Tache> taches;


    public Employe(int identifiant, String nom, String prenom, Queue<Tache> taches) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.taches = taches;
    }

    public void ajouterTache(Tache tache) {
        this.taches.add(tache);
    }

    public void supprimerTache() {
        taches.remove();
    }


    public String toString(){
        return nom + " " + prenom + " " + identifiant + " \t\n[" + taches + "]";
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Queue<Tache> getTaches() {
        return taches;
    }

    public void setTaches(Queue<Tache> taches) {
        this.taches = taches;
    }
}
