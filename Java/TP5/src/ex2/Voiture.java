package ex2;

public class Voiture extends Vehicule{
    private int nbrSiege;

    public Voiture(String immatriculation, String nom, String marque,
                   String carburant, int annee, int nbrCheveau, int nbrSiege ) {
        super(immatriculation, nom, marque, carburant, annee, nbrCheveau);
        this.nbrSiege = nbrSiege;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==null)return false;
        if(obj instanceof Voiture) {
            Voiture v = (Voiture) obj;
            return v.getNom().equals(this.getNom())
                    && v.getMarque().equals(this.getMarque())
                    && v.getNbrSiege() == this.getNbrSiege();
        }
        return false;
    }

    public int getNbrSiege() {
        return nbrSiege;
    }

    public void setNbrSiege(int nbrSiege) {
        this.nbrSiege = nbrSiege;
    }
}
