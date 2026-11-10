package ex2.withStream;

import ex2.Etudiant;

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
    public Etudiant rechercherEtudiantParMatricule2(String matricule){
        return etudiants.stream()
                .filter(x->x.getMatricule().equals(matricule))
                .findFirst().orElse(null);
    }
    public void afficherEtudiants(){
        etudiants.forEach(e -> e.afficherInfos());
        //ou
        etudiants.forEach(Etudiant::afficherInfos);
    }

    public void afficherNotesEtudiant(Etudiant e){
        if(e!=null) System.out.println(e.getNotes()
                .values().stream().mapToDouble(Double::doubleValue)
                .average());
    }

    public List<Etudiant> filtrerEtudiantsParMatiere(String matiere){
        return etudiants.stream()
                .filter(e -> e.getNotes().containsKey(matiere))
                .collect(Collectors.toList());
    }

    public double obtenirMoyenne(Etudiant e){
        return e.getNotes()
                .values().stream().mapToDouble(Double::doubleValue)
                .average().orElse(0);
    }

    public List<Etudiant> filtrerEtudiantsParMoyenne(double seuil){
        return etudiants.stream()
                .filter(e -> obtenirMoyenne(e)==seuil)
                .collect(Collectors.toList());
    }

    public Set<String> obtenirToutesMatieres2(){
        return etudiants.stream()
                .map(e -> e.getNotes().keySet())
                .reduce(new HashSet<>(), (acc, set) -> {
                    acc.addAll(set);
                    return acc;
                });
    }

    public Set<String> obtenirToutesMatieres(){
        return etudiants.stream()
                .flatMap(e->e.getNotes().keySet().stream())
                .collect(Collectors.toSet());
    }

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
