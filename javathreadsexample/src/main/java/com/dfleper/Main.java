package com.dfleper;

public class Main {
    public static void main(String[] args) {
        Bodega bodega = new Bodega();
        Quesero quesero = new Quesero(bodega);
        Raton raton = new Raton(bodega);
        quesero.start();
        raton.start();
        try {
            quesero.join();
            raton.join();
        } catch (Exception e) {
        }
        System.out.println(" ");
        System.out.println("\u001B[32mSera mejor que llame al Flautista de Hamelin !!!\u001B[0m");
        System.out.println(" ");
    }
}