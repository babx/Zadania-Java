package com.zadania;

public class Main {

    public static void main(String[] args) {
    Kolo ko = new Kolo(10);
    Kwadrat kw = new Kwadrat(10);
        System.out.println(ko.obliczObwod());
        System.out.println(ko.obliczPowierzchnie());
        System.out.println(kw.obliczObwod());
        System.out.println(kw.obliczPowierzchnie());
    }
}

interface ksztalt {
    public double obliczPowierzchnie();
    public double obliczObwod();
}
class Kwadrat implements ksztalt {
    double dlugoscBoku;
    Kwadrat (double i) {
        dlugoscBoku = i;
    }
    public double obliczPowierzchnie() {
        return dlugoscBoku * dlugoscBoku;
    };
    public double obliczObwod() {
        return dlugoscBoku * 4;
    };
}
class Kolo implements ksztalt {
    double promien;
    Kolo (double i) {
        promien = i; }
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    };

    public double obliczPowierzchnie() {
        return Math.PI * promien * promien;
    };
}