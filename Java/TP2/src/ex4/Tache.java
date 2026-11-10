package ex4;

import java.time.LocalDate;
import java.util.Objects;

public class Tache {
    private int numero;
    private LocalDate dateTache;
    private int delai;

    public Tache(int numero, LocalDate dateTache, int delai) {
        this.numero = numero;
        this.dateTache = dateTache;
        this.delai = delai;
    }
    public Tache(){
        numero = 0;
        delai = 0;
        dateTache = LocalDate.now();
        dateTache = LocalDate.of(2020, 1, 1);
    }

    public String toString(){
        return  numero + " " + dateTache + " " + delai;
    }


    /*public boolean equals(Object obj){
            if(obj.getClass()== this.getClass()){
                Tache t = (Tache) obj;
                if( t.delai == delai &&
                        t.numero == numero && t.dateTache.equals(dateTache))
                    return true;
            }
            return false;
        }*/
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tache tache = (Tache) o;
        return numero == tache.numero &&
                delai == tache.delai &&
                Objects.equals(dateTache, tache.dateTache);
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDateTache() {
        return dateTache;
    }

    public void setDateTache(LocalDate dateTache) {
        this.dateTache = dateTache;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

/*
    @Override
    public int compareTo(Tache o) {
        /*if(this.delai > o.delai) return 1;
        else if(this.delai < o.delai) return -1;
        else return 0;

        return Integer.compare(o.getDelai(), this.getDelai());


    }*/
}
