package ex4;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /* Pour une file d'attente basique */
        Queue<Tache> taches = new LinkedList<>();
        Employe emp1 = new Employe(1, "emp1", "emp1", taches);

        /*
            Pour une file d'attente avec priorité
            Ici on choisie le numéro comme priorité
            Ici c'est possible de choisir n'importe quel autre attribut
        */
        Employe emp = new Employe(1, "emp1", "emp1",
                new PriorityQueue<>(Comparator.comparing(Tache::getNumero)));

        emp.ajouterTache(new Tache(1, LocalDate.of(2025,04, 10), 2));
        emp.ajouterTache(new Tache(2, LocalDate.of(2025,04, 20), 1));
        emp.ajouterTache(new Tache(3, LocalDate.of(2025,05, 30), 3));
        System.out.println(emp);

        System.out.println("Test de suppression");
        emp.supprimerTache();
        System.out.println(emp);
    }
}
