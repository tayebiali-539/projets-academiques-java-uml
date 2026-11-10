package com.ex5;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order(1,500,Status.PENDING));
        orders.add(new Order(2,650,Status.DELIVERED));
        orders.add(new Order(3,1000,Status.SHIPPED));
        orders.add(new Order(4,300,Status.SHIPPED));
        orders.add(new Order(5,150,Status.PENDING));

        OrderProcess op1 = p->{
            if(p.getEtat()==Status.PENDING)
                p.setEtat(Status.SHIPPED);
        };
        //OrderProcess op2 = p->p.getEtat()==Status.PENDING?p.setEtat(Status.SHIPPED);
        double montantTotal = orders.stream()
                .filter(e->e.getEtat()==Status.DELIVERED)
                .mapToDouble(Order::getAmount)
                .sum();
        System.out.println(montantTotal);
        orders.stream()
                .filter(e->e.getAmount()>500)
                .forEach(e-> System.out.println(e));
    }
}
