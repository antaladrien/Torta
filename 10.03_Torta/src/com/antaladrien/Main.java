package com.antaladrien;

public class Main {

    public static void main(String[] args) {
	    Torta t1 = new Torta();
	    Torta t2 = new Torta(3, false);

        for (int i = 0; i < 2; i++) {
            if (t1.kremmelMegken())
                System.out.println("A(z) " + t1 + ", a tortát megkentem.");
            else
                System.out.println("A(z) " + t1 + ", a torta már meg van kenve.");
        }

        t1.ujEmelet();

        System.out.println(t1);
        System.out.println(t2);
    }
}
