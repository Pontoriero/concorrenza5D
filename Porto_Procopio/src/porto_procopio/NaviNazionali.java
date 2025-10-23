/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porto_procopio;

/**
 *
 * @author verifica
 */
public class NaviNazionali implements Runnable{
    CapitaneriaDiPorto c1;
    private String id;

    public NaviNazionali(String Id, CapitaneriaDiPorto c1) {
        this.id = id;
        this.c1 = c1;
    }
    
    
    @Override
    public void run(){
        try{
            Thread.sleep((long) (Math.random() * 10 + 1));
            c1.entraNaveNazionale();
            Thread.sleep((long) (Math.random() * 10 + 1));
            c1.uscitaNaviNazionali();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
