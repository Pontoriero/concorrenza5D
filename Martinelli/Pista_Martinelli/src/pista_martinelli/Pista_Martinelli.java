
package pista_martinelli;


public class Pista_Martinelli {

    
    public static void main(String[] args) {
        TorreControllo t=new TorreControllo();
        //legenda true= internazionale false=nazionale
        
        //lancio aerei internazionali
        for (int i = 0; i < 5; i++) {
          new Thread(new Aereo(i+1,t,true)).start();  
        }
        
        //lancio aerei rnazionali
        for (int i = 5; i < 10; i++) {
          new Thread(new Aereo(i+1,t,false)).start();  
        }
    }
    
}
