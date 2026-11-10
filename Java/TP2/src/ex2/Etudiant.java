package ex2;

import java.util.Map;
import java.util.Objects;

public class Etudiant extends Personne{
    private String matricule;
    private Map<String, Double> notes;

    public Etudiant(int id, String nom, String prenom, String matricule, Map<String, Double> notes) {
        super(id, nom, prenom);
        this.matricule = matricule;
        this.notes = notes;
    }

    @Override
    public void afficherInfos() {
        System.out.println(matricule+" "+super.getNom()+" "+super.getPrenom() + notes);
    }

    public String toString(){
        return matricule+" "+super.toString();
    }
    public double getMoyenne(){
        return notes.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    /*
    Il faut qu'on ajoute equals & hashCode vue dans la classe université
    on déclare un set des étudiants et soit le set ou le map
    toutes les opérations se baseent sur la comparaison et l'accès rapide
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return super.getId() == etudiant.getId()
                && super.getNom().equals(etudiant.getNom())
                && super.getPrenom().equals(etudiant.getPrenom())
                && Objects.equals(matricule, etudiant.matricule);
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.getId(), super.getNom(),
                            super.getPrenom(),matricule);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Map<String, Double> getNotes() {
        return notes;
    }

    public void setNotes(Map<String, Double> notes) {
        this.notes = notes;
    }
}
