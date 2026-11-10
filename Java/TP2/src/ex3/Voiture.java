package ex3;

import java.util.Objects;

public class Voiture extends Vehicule {

    public Voiture(String immatricule, String marque, int nbrSiege) {
        super(immatricule, marque, nbrSiege);
    }
    public String toString(){
        return getImmatricule() + " " + super.getMarque() + " " + super.getNbrSiege();
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        //if(obj == null || !(obj instanceof Voiture)) return false;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Voiture vtr = (Voiture) obj;
        return this.getImmatricule().equals(vtr.getImmatricule());
       // return this.getNbrSiege() == vtr.getNbrSiege();
    }
    public int hashCode() {
        return Objects.hash(getImmatricule(), getMarque(),
                getNbrSiege(),getDateAchat());
    }
}
