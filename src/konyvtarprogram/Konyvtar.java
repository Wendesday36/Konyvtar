package konyvtarprogram;

import java.util.List;

public class Konyvtar {
     int keszlet;
     int allapot;
     List <AbstractTermek> termekek;
    public Konyvtar(int keszlet, int allapot) {
        this.keszlet = keszlet;
        this.allapot = allapot;
        
    }
  
     public void termekek(){
         Konyv k1 = new Konyv("Punk 57", "Penelope Dougles",0);
         Manga m1 = new Manga("One Piece", "Ochiro Oda", "Ochiro Oda",1);
         termekek.add(k1);
         termekek.add(m1);
         for (int i = 0; i < termekek.size(); i++) {
             keszlet++;
         }
        
     }
      public void kiir(){
             for (int i = 0; i < termekek.size(); i++) {
                 System.out.println(termekek.get(i));
          }
         }

    @Override
    public String toString() {
        return "Konyvtar{" + "keszlet=" + keszlet + ", allapot=" + allapot + ", termekek=" + termekek + '}';
    }
     
public void run(){
    termekek();
    kiir();
    toString();
}
}
