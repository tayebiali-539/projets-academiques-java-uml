package ex2;

public class Vetement {
    private int id,stock;
    private double price;
    private String nom,categorie;
    private boolean onSale;

    public Vetement(int id, int stock, double price, String nom, String categorie, boolean onSale) {
        this.id = id;
        this.stock = stock;
        this.price = price;
        this.nom = nom;
        this.categorie = categorie;
        this.onSale = onSale;
    }
    public String toString(){
        return nom + " " + stock + " " + price + " " + categorie + " " + onSale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
}
