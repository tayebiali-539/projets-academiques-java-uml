package ex2;

import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Universite universite = new Universite();
        Etudiant etd1 = new Etudiant(1,"nom1", "prenom1", "ETD1",new HashMap<>());
        Etudiant etd2 = new Etudiant(2,"nom2", "prenom2", "ETD2",new HashMap<>());
        Etudiant etd3 = new Etudiant(3,"nom3", "prenom3", "ETD3",new HashMap<>());

        etd1.getNotes().put("matiere1",15D);
        etd1.getNotes().put("matiere2",10D);

        etd2.getNotes().put("matiere1",12D);
        etd2.getNotes().put("matiere3",18D);

        etd3.getNotes().put("matiere2",18D);
        etd3.getNotes().put("matiere4",16D);

        universite.ajouterEtudiant(etd1);
        universite.ajouterEtudiant(etd2);
        universite.ajouterEtudiant(etd3);

        System.out.println("Test de recherche par Matricule :");
        System.out.println(universite.rechercherEtudiantParMatricule("matiere1"));

        System.out.println("Test d'affichage des notes d'un étudiant :");
        universite.afficherNotesEtudiant(etd1);

        System.out.println("Test d'affichage des étudiants :");
        universite.afficherEtudiants();

        System.out.println("Test de recherche des étudiants par Matière :");
        universite.filtrerEtudiantsParMatiere("matiere2").forEach(System.out::println);

        System.out.println("Test de récupération de toutes les matières :");
        universite.obtenirToutesMatieres().forEach(System.out::println);

        System.out.println("Test de récupération des étudiants par moyenne :");
        universite.filtrerEtudiantsParMoyenne(12).forEach(System.out::println);

        System.out.println("Test pour : Affichage des moyennes de chaque étudiant, ");
        universite.getEtudiants().forEach(e->System.out.println(e +" "+universite.obtenirMoyenne(e)));

        System.out.println("Test : Trier les étudiants par ordre alphabétique avant de les afficher.");
        //Puisque les etudiants sont sauvegarder dans un set, cette dernière ne possède pas une méthode sort
        // car l'ordre est l'ordre de hashcode
        //Donc soit on crée une copies des données dans une list et on appelle le sort
        //soit on utilise les streams.
        universite.getEtudiants().stream().sorted(Comparator.comparing(Etudiant::getMatricule)).forEach(System.out::println);
        //ordre décroissant
        universite.getEtudiants().stream()
                .sorted(Comparator.comparing(Etudiant::getMatricule).reversed())
                .forEach(System.out::println);

        System.out.println("Test : rier les étudiants selon leur moyenne générale avant de les afficher.");
        //Pour simplifier la tâche ici j'ai ajouté une méthode getMoyenne dans la classe Etudiant
        //permet de calculer la moyenne des notes de l'étudiant courant
        //Les methodes comparing, comparingDouble, comparingInt =>permet de préciser l'attribut sur laquelle
        // le comparator va faire la comparaison pour chaque deux étudiants.
        universite.getEtudiants().stream()
                .sorted(Comparator.comparingDouble(e-> e.getMoyenne()))
                .forEach(System.out::println);
    }
}
