package org.example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Loto {


    static Set<Integer> lotoLista = new HashSet<>();

    public static void genTiketLoto() {

      
        for (int i = 0; i < 6; i++) {
            int loto4 = new Random().nextInt(1, 49);
            System.out.print(loto4 + " ");
            lotoLista.add(loto4);


        }

        System.out.println(" \n NUMERE EXTRASE");

        int loto3 = 0;
        for (int j = 0; j < 6; j++) {
            loto3 = new Random().nextInt(1, 49);
            System.out.print(loto3 + " ");

        }
        if (lotoLista.equals(loto3)) {
            System.out.println("\n Ai Castigat");

        }else {
            System.out.println("\n AI PIERDUT !!!");
        }
    }
}










