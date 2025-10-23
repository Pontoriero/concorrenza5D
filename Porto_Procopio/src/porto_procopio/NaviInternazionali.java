/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porto_procopio;

/**
 *
 * @author verifica
 */
public class NaviInternazionali implements Runnable{
    CapitaneriaDiPorto c1;
    private String id;

    public NaviInternazionali(String id, CapitaneriaDiPorto c1) {
        this.id = id;
        this.c1 = c1;
    }

    @Override
    public void run(){
        try{
            Thread.sleep((long) (Math.random() * 10 + 1));
            c1.entraNaveInternazionale();
            Thread.sleep((long) (Math.random() * 10 + 1));
            c1.uscitaNaviInternazionali();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
