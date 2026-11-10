package ex1;

import java.util.Objects;

public class Livre {
    private String titre;
    private String auteur;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }
    public Livre(){
        this.titre = "INCONNU";
        this.auteur = "INCONNU";
    }
    //public boolean equals(Livre x){}
    /*
    @Override
    public boolean equals(Object x){
        //if(x.getClass().equals(Livre.class)){}
        //if(x.getClass()==this.getClass()){}
        if(x instanceof Livre) {
            Livre y = (Livre) x;
            return this.titre.equals(y.getTitre());
        }
        return false;
    }*/

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Livre livre = (Livre) object;
        return Objects.equals(titre, livre.titre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titre);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String t) {
        this.titre = t;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
