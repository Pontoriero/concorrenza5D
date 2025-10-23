/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_pezzi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author verifica
 */
public class Porto_pezzi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CapitaneriaDiPorto p1 = new CapitaneriaDiPorto();

        Thread n1 = new Thread(new NaviNazionali(p1, "1"));
        Thread n2 = new Thread(new NaviNazionali(p1, "2"));
        Thread n3 = new Thread(new NaviNazionali(p1, "3"));
        Thread n4 = new Thread(new NaviNazionali(p1, "4"));
        Thread n5 = new Thread(new NaviNazionali(p1, "5"));

        Thread i1 = new Thread(new NaviIntenazionali(p1, "6"));
        Thread i2 = new Thread(new NaviIntenazionali(p1, "7"));
        Thread i3 = new Thread(new NaviIntenazionali(p1, "8"));
        Thread i4 = new Thread(new NaviIntenazionali(p1, "9"));
        Thread i5 = new Thread(new NaviIntenazionali(p1, "10"));

        n1.start();
        n2.start();
        n3.start();
        n4.start();
        n5.start();

        i1.start();
        i2.start();
        i3.start();
        i4.start();
        i5.start();

        try {
            n1.join();
            n2.join();
            n3.join();
            n4.join();
            n5.join();

            i1.join();
            i2.join();
            i3.join();
            i4.join();
            i5.join();
        } catch (InterruptedException ex) {
            System.out.println("Navi terminate");
        }

    }

}
