package konyvtarprogram;

import java.util.UUID;

abstract public class AbstractTermek {
   private  UUID id = new UUID(1, 10);
   private String cim;
   private String iro;

    public AbstractTermek(String cim, String iro) {
        this.cim = cim;
        this.iro = iro;
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

    @Override
    public String toString() {
        return "AbstractTermek{" + "id=" + id + ", cim=" + getCim() + ", iro=" + getIro() + '}';
    }
   
   
  
    
}
