package com.ex6;

public class Main {
    public static void main(String[] args) {
        Departement dep1 = new Departement("IT");
        Departement dep2 = new Departement("HR");
        Departement dep3 = new Departement("SALES");

        dep1.addEmployee(new Employe(1,"n1",15000));
        dep1.addEmployee(new Employe(2,"an2",3000));
        dep1.addEmployee(new Employe(3,"n3",10000));

        dep2.addEmployee(new Employe(1,"ap1",20000));
        dep2.addEmployee(new Employe(2,"p2",30000));
        dep2.addEmployee(new Employe(3,"p3",3000));

        dep3.addEmployee(new Employe(1,"m1",17000));
        dep3.addEmployee(new Employe(2,"am2",30000));
        dep3.addEmployee(new Employe(3,"am3",13000));

        EmployeFilter ef = e->e.getSalary()>3000;
        System.out.println("Employé de IT gagnant plus que 3000dh ");
        for(Employe e : dep1.employes){
            if(ef.test(e)) System.out.println(e);
        }
        EmployeFilter ef2 = e->e.getName().startsWith("A");
        System.out.println("Employé dont le nom commence par A ");
        for(Employe e : dep1.employes){
            if(ef.test(e)) System.out.println(e);
        }
        for(Employe e : dep2.employes){
            if(ef.test(e)) System.out.println(e);
        }
        for(Employe e : dep3.employes){
            if(ef.test(e)) System.out.println(e);
        }
        System.out.println("Moyenne des salaires par departement ");
        double mDep1 = dep1.employes
                .stream()
                .mapToDouble(Employe::getSalary)
                .average().orElse(0.0);
        double mDep2 = dep2.employes
                .stream()
                .mapToDouble(Employe::getSalary)
                .average().orElse(0.0);
        double mDep3 = dep3.employes
                .stream()
                .mapToDouble(Employe::getSalary)
                .average().orElse(0.0);



    }
}
