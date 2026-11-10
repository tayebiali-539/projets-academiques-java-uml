package ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Universite {
    private Set<Etudiant> etudiants;
    public Universite() {
        etudiants = new HashSet<>();
    }

    public void ajouterEtudiant(Etudiant e){
        etudiants.add(e);
    }
    public Etudiant rechercherEtudiantParMatricule(String matricule){
        for(Etudiant e : etudiants){
            if(e.getMatricule().equals(matricule)) return e;
        }
        return null;
    }

    public void afficherEtudiants(){
        for(Etudiant e : etudiants){
            e.afficherInfos();
        }
        //ou
        //etudiants.forEach(e -> e.afficherInfos());
        //ou
       // etudiants.forEach(Etudiant::afficherInfos);
    }
    public void afficherNotesEtudiant(Etudiant e){
        if(e==null) System.out.println("null");
        else{
            double moyenne = 0;
            for(Double n:e.getNotes().values()){
                moyenne += n;
            }
            System.out.println("La moyenne est : "+moyenne/e.getNotes().size());
        }
    }

    public List<Etudiant> filtrerEtudiantsParMatiere(String matiere){
        List<Etudiant> resultat = new ArrayList<>();
        for(Etudiant e : etudiants){
            if(e.getNotes().containsKey(matiere)) resultat.add(e);
        }
        return resultat;
    }

    public double obtenirMoyenne(Etudiant e){
        if(e==null) return 0;
        else{
            double moyenne = 0;
            for(Double n:e.getNotes().values()){
                moyenne += n;
            }
            return moyenne/e.getNotes().size();
        }
    }

    public List<Etudiant> filtrerEtudiantsParMoyenne(double seuil){
        List<Etudiant> resultat = new ArrayList<>();
        for(Etudiant e : etudiants){
            if(obtenirMoyenne(e)==seuil) resultat.add(e);
        }
        return resultat;
    }

    public Set<String> obtenirToutesMatieres(){
        Set<String> toutesMatieres = new HashSet<>();
        for(Etudiant e : etudiants){
            toutesMatieres.addAll(e.getNotes().keySet());
        }
        return toutesMatieres;
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
