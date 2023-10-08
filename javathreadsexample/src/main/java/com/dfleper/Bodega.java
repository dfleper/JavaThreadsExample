package com.dfleper;

public class Bodega {

    private int quesos = 0;

    public synchronized void guardar() {
        try {
            while (quesos >= 5)
                this.wait();
        } catch (Exception e) {
        }
        quesos++;
        System.out.println("Quesero hace queso y lo guarda en el estante " + quesos);
        this.notify();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sacar() {
        try {
            while (quesos == 0)
                this.wait();
        } catch (Exception e) {
        }
        System.out.println("\uu001B[33mRaton se lleva el queso del estante " + quesos + "\u001B[0m");
        quesos--;
        this.notify();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}