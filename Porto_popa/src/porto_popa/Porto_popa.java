

package porto_popa;


public class Porto_popa {

   
    public static void main(String[] args) {
        
        CapitaneriaDiPorto cp= new  CapitaneriaDiPorto();
        
        for(int i=1;i<6;i++){
             
           
            new Thread(new Internazionale(cp,"internazionale"+ (i+5))).start();
             new Thread(new Nazionale(cp,"nazionale"+ i)).start();
            
        }
        
    }
    
}
