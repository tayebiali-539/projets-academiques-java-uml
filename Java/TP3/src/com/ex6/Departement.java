package com.ex6;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    public String name;
    public List<Employe> employes;

    public Departement(String name) {
        this.name = name;
        this.employes = new ArrayList<Employe>();
    }
    public void addEmployee(Employe employee) {
        this.employes.add(employee);
    }
    public void afficher() {
        this.employes.forEach(employee -> System.out.println(employee));
    }


}
