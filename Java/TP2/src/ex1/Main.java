package ex1;

public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio=  new Bibliotheque();

        biblio.etageres.add(new Etagere(4));
        biblio.etageres.add(new Etagere(4));
        //affichage
        for(Etagere et : biblio.etageres){
            System.out.println(et.getNumeroEtage()+" nbrLivres :"+et.getListeLivres2().size());
        }
        biblio.ajouterLivreEtagere(1,new Livre());
        biblio.ajouterLivreEtagere(1,new Livre());
        biblio.ajouterLivreEtagere(3,new Livre("Livre 1","Auteur1"));
        biblio.ajouterLivreEtagere(3,new Livre("Livre 2","Auteur2"));
        biblio.ajouterLivreEtagere(3,new Livre("Livre 3","Auteur1"));
        System.out.println("****************************");
        for(Etagere et : biblio.etageres){
            System.out.println(et.getNumeroEtage()+" nbrLivres :"+et.getListeLivres2().size());
        }
        System.out.println("*********************");
        System.out.println(biblio.existeLivre(new Livre("Livre 1","Auteur1")));
    }
}
