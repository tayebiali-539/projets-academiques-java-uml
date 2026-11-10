package ex1;

import java.util.HashSet;
import java.util.Set;

public class Bibliotheque {

    public Set<Etagere> etageres;
    //Un constructeur
    public Bibliotheque(){
        //etageres = new HashSet<Etagere>(3);
        etageres = new HashSet<>();
        etageres.add(new Etagere(1));
        etageres.add(new Etagere(2));
        etageres.add(new Etagere(3));
    }

    //Ajouter un livre sur une étagère donnée
    public void ajouterLivreEtagere(int numeroEtage, Livre l){
        for(Etagere et : etageres){
            if(et.getNumeroEtage()==numeroEtage) {
                et.ajouterLivre(l);
                return;
            }
        }
    }

    //Méthode permettant de savoir si un livre
    // est présent dans la bibliothèque.
    public boolean existeLivre(Livre l){
        for(Etagere et : etageres){
            if(et.doesExist(l)) return true;
            /*
            for(Livre liv : et.getListeLivres2()){
                if(liv.getAuteur().equals(l.getAuteur()) &&
                    liv.getTitre().equals(l.getTitre())) return true;
            }*/
        }
        return false;
    }

}
