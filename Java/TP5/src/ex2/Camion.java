package ex2;

public class Camion extends Vehicule{
    private double capacite;
    private TypeCamion type;

    public Camion(String immatriculation, String nom, String marque,
                   String carburant, int annee, int nbrCheveau, double capacite, TypeCamion type ) {
        super(immatriculation, nom, marque, carburant, annee, nbrCheveau);
        this.capacite = capacite;
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==null)return false;
        if(obj instanceof Camion) {
            Camion v = (Camion) obj;
            return v.getMarque().equals(this.getMarque())
                    && v.getCapacite() == this.getCapacite()
                    && v.getType() == this.getType();
        }
        return false;
    }

    public double getCapacite() {
        return capacite;
    }

    public void setCapacite(double capacite) {
        this.capacite = capacite;
    }

    public TypeCamion getType() {
        return type;
    }

    public void setType(TypeCamion type) {
        this.type = type;
    }
}
