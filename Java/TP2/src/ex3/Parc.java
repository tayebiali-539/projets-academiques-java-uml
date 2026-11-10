package ex3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Parc {
    private Map<Integer, Vehicule>  vehicules;
    public Parc() {
        this.vehicules = new HashMap<>();
    }
    public List<AutoCar> getAutoCare(){
        List<AutoCar> autoCars = new ArrayList<>();
        for(Vehicule vehicule : vehicules.values()){
            if(vehicule instanceof AutoCar) {
                AutoCar ac = (AutoCar) vehicule;
                autoCars.add(ac);
            }
        }
        return autoCars;
    }
    public List<AutoCar> getAutoCareWithStream(){
        return this.vehicules.values()
                .stream()
                .filter(o->o instanceof AutoCar)
                .map(o->(AutoCar)o)
                .collect(Collectors.toList());
    }

    public int countByMarque(String marque){
        int count = 0;
        for(Vehicule vehicule : vehicules.values()){
            if(vehicule.getMarque().equals(marque))count++;
        }
        return count;
    }

    public int countByMarqueWithStream(String marque){
        return (int)vehicules.values().stream()
                .filter(e->e.getMarque().equals(marque))
                .count();
    }

    public void supprimerVehicule(String immatricule){
        for(Map.Entry<Integer, Vehicule> entry : vehicules.entrySet()){
            if(entry.getValue().getImmatricule().equals(immatricule)){
                vehicules.remove(entry.getKey());
            }
        }
    }

    public List<Voiture> getVoiture(int nbrSiege) {
        List<Voiture> voitures = new ArrayList<>();
        for(Vehicule vehicule : vehicules.values()){
            if(vehicule instanceof Voiture && vehicule.getNbrSiege() == nbrSiege)
                voitures.add((Voiture) vehicule);
        }
        return voitures;
    }

    public List<Voiture> getVoitureWithStream(int nbrSiege) {
        return vehicules.values().stream()
                .filter(e->e instanceof Voiture && e.getNbrSiege() == nbrSiege)
                .map(e-> (Voiture) e)
                .toList();
    }

    public List<Vehicule> getParDate(LocalDate date) {
        List<Vehicule> voitures = new ArrayList<>();
        for(Vehicule vehicule : vehicules.values()){
            if(vehicule.getDateAchat().isBefore(date))
                voitures.add(vehicule);
        }
        return voitures;
    }

    public List<Vehicule> getParDateWithStream(LocalDate date) {
        return vehicules.values().stream()
                .filter(e->e.getDateAchat().isBefore(date))
                .toList();
    }

}
