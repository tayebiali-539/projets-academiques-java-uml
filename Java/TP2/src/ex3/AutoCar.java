package ex3;

import java.time.LocalDate;
import java.util.Objects;

public class AutoCar extends Vehicule {
    private int nbrPlace;
    private boolean premium;
    public AutoCar(String immatricule, String marque, int nbrSiege,int nbrPlace, boolean premium) {
        super(immatricule, marque, nbrSiege);
        this.nbrPlace = nbrPlace;
        this.premium = premium;
    }
    public String toString() {
        return super.getImmatricule()+ " " + super.getMarque()
                + " " + this.getNbrPlace() + " " + super.getNbrSiege()
                + " " + this.getDateAchat()
                + " " + this.premium;
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        AutoCar ac = (AutoCar) obj;
        return getImmatricule().equals(ac.getImmatricule())
                && nbrPlace == ac.getNbrPlace();
    }
    public int hashCode() {
        return Objects.hash(getImmatricule(), getMarque(),
                getNbrSiege(), nbrPlace, premium, getDateAchat());
    }

    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

}
