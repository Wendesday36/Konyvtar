
package konyvtarprogram;

public class Manga  extends AbstractTermek implements Kolcsonozheto{
    String grafikus;

    public Manga(String cim, String iro, int allapot) {
        super(cim, iro, allapot);
       
    }

    
    @Override
    public boolean kolcsonozheto() {
        if(super.getAllapot()==1){
            System.out.println("Kölcsönözhető");
            
        }
        
        return true;
   
    }

   

    @Override
    public String toString() {
        return super.toString()+ "Manga{" + "grafikus=" + grafikus + '}';
    }
    
    
    
}
