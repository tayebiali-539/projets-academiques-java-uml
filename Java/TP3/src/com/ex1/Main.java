package com.ex1;

public class Main {
    public static void main(String[] args) {
        Pile pile = new Pile();

        try {
            pile.depiler();
            pile.empiler(12L);
        }catch (PilePleineException e){
            System.out.println(e.getMessage());
        }
        catch (PileVideException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fin");
    }
}
