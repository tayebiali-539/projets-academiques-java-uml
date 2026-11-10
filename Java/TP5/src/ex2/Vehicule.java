package ex2;

import java.util.Comparator;

public abstract  class Vehicule implements Comparator<Vehicule> {
    private String immatriculation,nom, marque, carburant;
    private int annee, nbrCheveau;

    public Vehicule(String immatriculation, String nom, String marque, String carburant, int annee, int nbrCheveau) {
        this.immatriculation = immatriculation;
        this.nom = nom;
        this.marque = marque;
        this.carburant = carburant;
        this.annee = annee;
        this.nbrCheveau = nbrCheveau;
    }

   public String toString(){
        return immatriculation+" "+nom+" " +marque + " "+
                carburant+" "+ annee+" "+nbrCheveau;
   }
    public int compare(Vehicule o1, Vehicule o2) {
        return o1.getImmatriculation().compareTo(o2.getImmatriculation());
    }

    public abstract boolean equals(Object obj);
    public int hashCode() {
        return immatriculation.hashCode()+nom.hashCode();
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNbrCheveau() {
        return nbrCheveau;
    }

    public void setNbrCheveau(int nbrCheveau) {
        this.nbrCheveau = nbrCheveau;
    }
}
