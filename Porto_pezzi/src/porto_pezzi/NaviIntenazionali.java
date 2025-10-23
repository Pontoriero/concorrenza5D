/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto_pezzi;

/**
 *
 * @author verifica
 */
public class NaviIntenazionali implements Runnable {

    private CapitaneriaDiPorto capitaneriaDiPorto;
    private String id;

    public NaviIntenazionali(CapitaneriaDiPorto capitaneriaDiPorto, String id) {
        this.capitaneriaDiPorto = capitaneriaDiPorto;
        this.id = id;
    }

    public CapitaneriaDiPorto getCapitaneriaDiPorto() {
        return capitaneriaDiPorto;
    }

    public void setCapitaneriaDiPorto(CapitaneriaDiPorto capitaneriaDiPorto) {
        this.capitaneriaDiPorto = capitaneriaDiPorto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            
            System.out.println("NaveInterazionale: "+id+" in attesa d' entrata");
            capitaneriaDiPorto.entrataNaviInter();
            System.out.println("NaveInterazionale: "+id+ " entrata nella banchina");
            Thread.sleep((int) (Math.random() * (10000 + 1) + (20000 + 1)));//random tra 10 e 20?
            capitaneriaDiPorto.uscitaNaviInter();
            System.out.println("NaveInterazionale: "+id+" uscita dalla banchina");

        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
