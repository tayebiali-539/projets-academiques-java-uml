package com.ex4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Galaxy S23",8000, "Electornics"));
        products.add(new Product("Robe",800, "Clothing"));
        products.add(new Product("Cookies",1.5, "Groceries"));
        products.add(new Product("Tab A6",10000, "Electornics"));

        Filter f1 = p-> p.getCategory().equals("Electornics");
        /*Filter f11 = p-> {
            if(p.getCategory().equals("Electornics")) return true;
            return false;
        };*/
        Filter f2 = p-> p.getPrice()>100;
        System.out.println("\n\nLes produits appartenant à Electronics");
        for(Product p : products) {
            if(f1.test(p)) System.out.println(p);
        }
        System.out.println("\n\nLes produits ayant un prix > 100 :");
        for(Product p : products) {
            if(f2.test(p)) System.out.println(p);
        }
        //Les expressions lambdas :
        //products.stream().filter(f1::test).forEach(System.out::println);
        Comparator<Product> cmp = (p1,p2)->Double.compare(p1.getPrice(),p2.getPrice());
        Comparator<Product> cmp2 = (p1,p2)->{
            if(p1.getPrice()>p2.getPrice()) return 1;
            else if(p1.getPrice()<p2.getPrice()) return -1;
            else return 0;
        };
        products.sort(cmp);//ordre croissant
        System.out.println("\n\nAffichage apres le trie croissant");
        products.forEach(System.out::println);

        products.sort(cmp.reversed());//ordre decroissant
        //products.sort((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()));
        System.out.println("\n\nAffichage apres le trie decroissant");
        products.forEach(System.out::println);
    }
}
