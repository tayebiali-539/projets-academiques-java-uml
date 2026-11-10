package com.ex1;

public class Pile {
    private final static int taille = 10;
    private Object [ ] pile;
    private int pos;
    public Pile() {
        pile = new Object[taille];
    }
    public void empiler(Object p)throws PilePleineException {
        if(pos == taille) throw new PilePleineException("Pile pleine");
        pile[pos] = p;
        pos++;
    }
    public void depiler(){
        if(pos == 0) throw new PileVideException("Pile vide");
        pile[pos] = null;
        pos--;
    }
    public Object depiler2(){
        if(pos == 0) throw new PileVideException("Pile vide");
        Object temp = pile[pos];
        pile[pos] = null;
        pos--;
        return temp;
    }
}
