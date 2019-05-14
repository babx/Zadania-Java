package com.zadania;

public class Main {

    public static void main(String[] args) {
    SystemAudioSpecyficzny sa = new SystemAudioSpecyficzny();
    sa.odtwarzaj();
    sa.nagrywaj();
    sa.odtwarzajRadio();
    sa.wylacz();
    }
}
interface OdtwarzaczAudio {
    void odtwarzaj();
}
interface NagrywarkaAudio {
    void nagrywaj();
}
interface OdtwarzaczRadio {
    void odtwarzajRadio();
}
interface SystemAudio extends OdtwarzaczAudio, NagrywarkaAudio {
}
abstract class SystemAudioPodstawowy implements SystemAudio, OdtwarzaczRadio {
    public void odtwarzaj() {
        System.out.println("odtwarzaj audio");
    }
    public void nagrywaj() {
        System.out.println("nagrywaj audio");
    }
}
class SystemAudioSpecyficzny extends  SystemAudioPodstawowy {
    @Override
    public void odtwarzajRadio() {
        System.out.println("odtwarzaj Rasdio");
    }
    void wylacz() {
        System.out.println("wyłącz");
    }
}