/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_torre;

import java.util.Random;

/**
 *
 * @author verifica
 */
public class Array_torre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random r = new Random();
        int n = r.nextInt(20 - 10 + 1) + 10;
        int k = r.nextInt(5 - 3 + 1) + 3;

        int v[] = new int[n];
        int vOut[] = new int[n];
        int start;
        int end;

        System.out.println("Lunghezza Array " + n);
        System.out.println("N. Thread " + k);

        for (int i = 0; i < n; i++) {
            v[i] = r.nextInt(100 - 0 + 1) + 0;
        }

        System.out.println("Vettore Iniziale: ");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }

        System.out.println("");
        System.out.println("Vettore Finale");
        
        for (int i = 0; i < k; i++) {
            start = (n / k) * i;
            end = ((n / k) * (i + 1));
            new Thread(new DivisioneV(v, start, end, vOut)).start();
        }

        //ALLA FINE HO PENSATO CHE AGGIUNGERE UN WAIT SAREBBE STATO CORRETTO (PENSO)
    }

}
