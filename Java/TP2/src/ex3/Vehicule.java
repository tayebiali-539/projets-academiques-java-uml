package ex3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;

public abstract class Vehicule implements Comparator<Vehicule> {
    private String immatricule, marque;
    private int nbrSiege;
    private LocalDate dateAchat;

    public Vehicule(String immatricule, String marque, int nbrSiege) {
        this.immatricule = immatricule;
        this.marque = marque;
        this.nbrSiege = nbrSiege;
        this.dateAchat = LocalDate.now();
    }

    public int compare(Vehicule v1, Vehicule v2) {
        //return Integer.compare(v1.getNbrSiege(), v2.getNbrSiege());
        return v1.getImmatricule().compareTo(v2.getImmatricule());
    }

   public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);

    public String getImmatricule() {
        return immatricule;
    }

    public void setImmatricule(String immatricule) {
        this.immatricule = immatricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getNbrSiege() {
        return nbrSiege;
    }

    public void setNbrSiege(int nbrSiege) {
        this.nbrSiege = nbrSiege;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }
}
