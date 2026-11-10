package ex1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(12, 7, 19, 4, 21, 8, 3, 10, 14, 5);

        //affichage
        l.stream()
                .forEach(System.out::println);
        l.stream()
                .forEach(x->System.out.println(x));
        l.forEach(System.out::println);

        //2: afficher les nombres pairs
        l.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
        //3
        l.stream().filter(y->y%2!=0)
                .mapToInt(x->x*x)
                .forEach(System.out::println);
        //4
        Set<Integer> s = l.stream().filter(x->x%2!=0)
                .collect(Collectors.toSet());
        s.forEach(System.out::println);
        //5
        int somme = l.stream().filter(x->x%2==0)
                .reduce(0,(a,b)->a+b);
        System.out.println(somme);
        //5
        int valeur =l.stream().filter(x->x%2!=0)
                .max((a,b)->Integer.compare(a,b)).orElse(0);
        System.out.println(valeur);
        //6
        int sommeImp=l.stream().filter(x->x%2!=0)
                .mapToInt(x->x*x)
                .sum();
        System.out.println(sommeImp);
         System.out.println(l.stream().filter(x->x%2!=0)
                .map(x->x*x)
                .reduce(0,(x,y)->x+y));
        //7le max ds carrées des nombres impaires dont le carré ne dépasse pas 100
        int max = l.stream().filter(x->x%2!=0)
                .mapToInt(x->x*x)
                .filter(y->y<=100)
                .max().orElse(0);
        System.out.println(max);
        List<Integer> l2=l.stream()
                .filter(x->x>10)
                .sorted((x,y)->Integer.compare(y,x))
                .collect(Collectors.toList());
        System.out.println(l2);
        //8
        int petit = l.stream()
                .mapToInt(x->x*x)
                .filter(x->x%2!=0)
                .min().orElse(0);
        System.out.println(petit);
    }
}
