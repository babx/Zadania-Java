package com.zadania;

public class Main {

    public static void main(String[] args) {
    int tab[] = {10, 20, 30, 10, 20};
    Wyszukiwanie ab = new Wyszukiwanie();
    int index = ab.szukaj(tab, 30, new SprawdzanieRownych());

    if (index == -1)
        System.out.println("Nie znaleziono");
    else
        System.out.println("Znaleziono w indeksie numer: " + index);
    }
}
interface Sprawdzanie {
    boolean porownaj(int a, int b);
}
class Wyszukiwanie {
    int szukaj(int a[], int ele, Sprawdzanie sprawdzenie) {
        for(int i=0; i < a.length; i++) {
            if ( sprawdzenie.porownaj(a[i], ele) ) {
                return i;
            }
        }

        return -1;
    }
}
class SprawdzanieRownych implements Sprawdzanie {
    @Override
    public boolean porownaj(int a, int b) {
        if (a == b)
            return true;
        else
            return false;
    }
}