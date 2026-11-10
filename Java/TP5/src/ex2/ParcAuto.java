package ex2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ParcAuto {
    private Map<Long, Vehicule> mapVehicule;
    public ParcAuto() {
        mapVehicule = new HashMap<Long, Vehicule>();
    }

    public boolean addVehicle(Long id, Vehicule ve) throws OutOfCapacityException {
        int cptVoiture = 0, cptCamion=0;
        for(Vehicule vehicule : mapVehicule.values()) {
            if(vehicule.getClass()==Voiture.class) cptVoiture++;
            else cptCamion++;
        }
        if(ve.getClass()==Voiture.class && cptVoiture<24) {
            mapVehicule.put(id, ve);
        }else if(ve.getClass()==Camion.class && cptCamion<15) {
            mapVehicule.put(id, ve);
        }
        else throw new OutOfCapacityException("Capacité dépassée");
        return true;
    }
    public boolean removeByImmatricule(String im) {
        for(Map.Entry<Long, Vehicule> v : mapVehicule.entrySet()) {
            if(v.getValue().getImmatriculation().equals(im))
            {
                mapVehicule.remove(v.getKey());
                return true;
            }
        }
        return false;
    }
    public boolean removeByImmatricule2(String im) {
        for(Long id: mapVehicule.keySet()) {
            if(mapVehicule.get(id).getImmatriculation().equals(im)){
                mapVehicule.remove(id);
                return true;
            }
        }
        return false;
    }
    public Set<Vehicule> toSet() {
        Set<Vehicule> set = new HashSet<Vehicule>();
        for(Vehicule v: mapVehicule.values()) {
            set.add(v);
        }
        return set;
    }
    public Set<Vehicule> toSet2() {
        Set<Vehicule> set = new HashSet<Vehicule>();
        set.addAll(mapVehicule.values());
        return set;
    }
    public Set<Vehicule> toSet3() {
        return new HashSet<>(mapVehicule.values());
    }

    public long nombreVehicules(){
        return mapVehicule.values()
                .stream()
                .filter(v->v.getAnnee()==2024 && v.getCarburant().equals("diesel"))
                .count();
    }

    public double getTotalCapacite() {
        return mapVehicule.values().stream()
                .filter(v->v instanceof  Camion)
                .map(v->(Camion)v)
                .filter(c->c.getType()==TypeCamion.TONNE)
                .mapToDouble(v->v.getCapacite())
                .reduce(0,(a,b)->a+b);
    }
    public double getTotalCapacite2() {
        return mapVehicule.values().stream()
                .filter(v->v instanceof  Camion)
                .map(v->(Camion)v)
                .filter(c->c.getType()==TypeCamion.TONNE)
                .mapToDouble(v->v.getCapacite())
                .sum();
    }

    public void getMaxCapacite() {
        Camion c = mapVehicule.values().stream()
                .filter(v->v instanceof Camion)
                .map(v->(Camion)v)
                .max((c1,c2)->Double.compare(c1.getCapacite(), c2.getCapacite()))
                .orElse(null);
        if(c==null) return;
        System.out.println(c.getImmatriculation()+" " + c.getNom());
    }
    public void afficherVehicules(String marque){
        mapVehicule.values().stream()
                .filter(v->v.getMarque().equals(marque))
                .sorted((v1,v2)->v1.getImmatriculation().compareTo(v2.getImmatriculation()))
                .forEach(System.out::println);
    }
}
