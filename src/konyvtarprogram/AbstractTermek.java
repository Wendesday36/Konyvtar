package konyvtarprogram;

import java.util.UUID;

abstract public class AbstractTermek {
   private  UUID id = new UUID(1, 10);
   private String cim;
   private String iro;
   private int allapot;

    public AbstractTermek(String cim, String iro, int allapot) {
        this.cim = cim;
        this.iro = iro;
        this.allapot = allapot;
    }
    

    
    public UUID getId() {
        return id;
    }

    public String getCim() {
        return cim;
    }

    public String getIro() {
        return iro;
    }

    public int getAllapot() {
        return allapot;
    }

    @Override
    public String toString() {
        return "AbstractTermek{" + "id=" + id + ", cim=" + cim + ", iro=" + iro + ", allapot=" + allapot + '}';
    }
    

   
   
   
  
    
}
