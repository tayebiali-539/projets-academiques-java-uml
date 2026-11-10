package ex1;

import java.util.ArrayList;
import java.util.List;

public class Etagere {
    private int numeroEtage;
    private List<Livre> listeLivres2;

    Etagere(int numEtage) {
        this.numeroEtage = numEtage;
        this.listeLivres2 = new ArrayList<>();
    }

    //Ajouter un livre
    public void ajouterLivre(Livre livre) {
        this.listeLivres2.add(livre);
    }

    //Retirer un livre dont on donne
    // son index (la position sur l’étagère).
    public void supprimerLivre(int indice){
        if(indice >=0 && indice <listeLivres2.size())
            this.listeLivres2.remove(indice);
    }
    public boolean supprimerLivre2(int indice){
        if(indice >=0 && indice <listeLivres2.size())
        {
            this.listeLivres2.remove(indice);
            return true;
        }
        return false;
    }

    public void supprimerLivre(Livre l){
        //for(int i=0;i<listeLivres2.size();i++)
        for(Livre x:listeLivres2){
            if(x.getTitre().equals(l.getTitre())){
                this.listeLivres2.remove(x);
                return;
            }
        }

    }
    public void supprimerLivre2(Livre l){
        this.listeLivres2.remove(l);
    }

    //Récupérer un livre dont on donne son index.
    public Livre getLivre(int indice){
        return (indice >=0 && indice <listeLivres2.size()) ? this.listeLivres2.get(indice) : null;
    }

    public void afficher(){
        for(int i=0;i<listeLivres2.size();i++){
            System.out.println(listeLivres2.get(i).getAuteur());
        }

    }

    //Méthode permettant de savoir si un livre est présent sur l’étagère.
    public boolean doesExist(Livre l){
        return  this.listeLivres2.contains(l);
    }
    public boolean doesExistAll(Livre l){
        for(Livre x:listeLivres2){
            if(x.getTitre().equals(l.getTitre()) && x.getAuteur().equals(l.getAuteur()))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.numeroEtage);
    }
    public boolean equals(Object o){
        if(o instanceof Etagere)
            return ((Etagere)o).getNumeroEtage()==this.numeroEtage;
        else return false;
    }

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }

    public List<Livre> getListeLivres2() {
        return listeLivres2;
    }

    public void setListeLivres2(List<Livre> listeLivres2) {
        this.listeLivres2 = listeLivres2;
    }
}
