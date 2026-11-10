package com.ex5;

import java.util.Objects;

public class Order {
    private int id;
    private double amount;
    private Status etat;

    public Order(int id, double amount, Status etat) {
        this.id = id;
        this.amount = amount;
        this.etat = etat;
    }

    @Override
    public String toString() {
        return id +" " + amount +" " + etat;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return id == order.id
                && amount == order.amount
                && etat == order.etat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, etat);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Status getEtat() {
        return etat;
    }

    public void setEtat(Status etat) {
        this.etat = etat;
    }
}
