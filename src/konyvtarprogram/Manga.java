
package konyvtarprogram;

public class Manga  extends AbstractTermek implements Kolcsonozheto{
    String grafikus;

    public Manga(String cim, String iro,String grafikus) {
        super(cim, iro);
    }
    @Override
    public boolean kolcsonozheto() {
        System.out.println("Kölcsönözhető");
        return true;
   
    }

   

    @Override
    public String toString() {
        return super.toString()+ "Manga{" + "grafikus=" + grafikus + '}';
    }
    
    
    
}
