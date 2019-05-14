package com.zadania;

public class Main {

    public static void main(String[] args) {
        String plik = "Sample.mp4";
        FabrykaOdtwarzaczy fo = new FabrykaOdtwarzaczy();
        OdtwarzaczWideo odtwarzacz = fo.zwrocOdtwarzaczWideo(plik);

        if (odtwarzacz != null)
            odtwarzacz.odtwarzaj(plik);
    }
}
interface OdtwarzaczWideo {
    void odtwarzaj(String nazwaPliku);
}
class OdtwarzaczMP4 implements OdtwarzaczWideo {
    @Override
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("odtwarzaj format mp4 z pliku " + nazwaPliku);
    }
}
class OdtwarzaczAVI implements OdtwarzaczWideo {
    @Override
    public void odtwarzaj(String nazwaPliku) {
        System.out.println("odtwarzaj format avi z pliku " + nazwaPliku);

    }
}
class FabrykaOdtwarzaczy {
  OdtwarzaczWideo zwrocOdtwarzaczWideo(String nazwaPliku) {
      if (nazwaPliku.endsWith(".avi"))
          return new OdtwarzaczAVI();
      else if (nazwaPliku.endsWith(".mp4"))
          return new OdtwarzaczMP4();
      else 
          return null;
  }
}