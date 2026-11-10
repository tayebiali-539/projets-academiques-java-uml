package ex2;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Magasin {
    List<Vetement> liste;
    public Magasin() {
        liste = new LinkedList<>();
    }
    public void getPromotions() {
        liste.stream()
                .filter(x->x.isOnSale()==true)
                .forEach(x->System.out.println(x.getNom()+" "+x.getPrice()));
    }
    public void afficherMoinsChers(){
        liste.stream()
                .sorted((a,b)->Double.compare(a.getPrice(),b.getPrice()))
                .limit(3)
                .forEach(System.out::println);
    }
    public double calculerTotal(){
        return liste.stream()
                .mapToDouble(p->p.getPrice()*p.getStock())
                .sum();//reduce(0,(a,b)->a+b).orElse(0)
    }
    public Map<String, List<Vetement>> getMap(){
     return liste.stream()
             .collect(Collectors.groupingBy(v->v.getCategorie())) ;
    }
    public List<String> listeCategorie(){
        return liste.stream()
                .filter(v->v.getStock()>20)
                .map(x->x.getNom())
                .collect(Collectors.toList());
    }
    public boolean verifierStock(){
        return liste.stream().allMatch(v->v.getStock()>0);
    }
    public List<Vetement> appliquerRemise(){
        return liste.stream()
                .peek(v->{
                    if(v.isOnSale()) {
                        double price = v.getPrice()-(v.getPrice()*0.2);
                        v.setPrice(price);
                    }
                })
                .collect(Collectors.toList());
    }
    public void affichagePersonnalise(){
        liste.stream()
                .map(v->"ID: "+v.getId()+" | "+
                        "Nom: "+v.getNom()+" | Prix: "+
                        v.getPrice()+"dh | Stock:"+v.getStock())
                .forEach(System.out::println);
    }
    //Sans le Map
    public void affichagePersonnalise2(){
        liste.stream()
                .forEach(v->System.out.println("ID: "+v.getId()+" | "+
                        "Nom: "+v.getNom()+" | Prix: "+
                        v.getPrice()+"dh | Stock:"+v.getStock()))
                ;
    }

}
