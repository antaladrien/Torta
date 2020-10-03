package com.antaladrien;

public class Torta {
    int emelet;
    boolean megkenve;

    public Torta(int emelet, boolean megkenve) {
        this.emelet = emelet;
        this.megkenve = megkenve;
    }

    public Torta() {
        this(1, false);
    }

    public void ujEmelet() {
        emelet++;
    }

    public boolean kremmelMegken() {
        if (!megkenve) {
            megkenve = true;
            return true;
        }
        return false;
    }

    public int mennyiKaloria() {
        if (megkenve)
            return 1000*emelet*2;
        else
            return 1000*emelet;
    }

    @Override
    public String toString() {
        return emelet + " emeletes torta" + (megkenve?" krémmel megkenve":"") + ", kalória: " + mennyiKaloria();
    }
}
