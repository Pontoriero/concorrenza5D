/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_gjikuria;

/**
 *
 * @author verifica
 */
public class Porto_Gjikuria {

    public static void main(String[] args) {

        CapitaneriaDiPorto p = new CapitaneriaDiPorto();

        for (int i = 0; i < 10; i++) {
            new Thread(new Nazionali("id" + i, p)).start();
            new Thread(new Internazionali("id" + i, p)).start();
        }

        

    }

}
