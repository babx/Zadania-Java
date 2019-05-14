package com.zadania;

public class Main {

    public static void main(String[] args) {
	PrzykladowaKlasa kl = new PrzykladowaKlasa();
	kl.inndaMetoda();
	kl.przykladowaMetoda();
    }
}
interface PrzykladowyInterfejs {
    void przykladowaMetoda();
}
interface InnyInterfejs {
    void inndaMetoda();
}
class PrzykladowaKlasa implements PrzykladowyInterfejs, InnyInterfejs {

    @Override
    public void przykladowaMetoda() {
        System.out.println("Implementacja prykladowejMetody");
    }

    @Override
    public void inndaMetoda() {
        System.out.println("Implementacja innejMetody");
    }
}