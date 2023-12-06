package konyvtarprogram;

import java.util.UUID;

abstract public class AbstractTermek {
   private  UUID id = new UUID(1, 10);
   private String cim;
   private String iro;

    public UUID getId() {
        return id;
    }

    public String getCim() {
        return cim;
    }

    public String getIro() {
        return iro;
    }

    @Override
    public String toString() {
        return "AbstractTermek{" + "id=" + id + ", cim=" + cim + ", iro=" + iro + '}';
    }
   
   
  
    
}
