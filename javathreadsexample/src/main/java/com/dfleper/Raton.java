package com.dfleper;

public class Raton extends Thread {

    private Bodega bodega;

    public Raton(Bodega a) {
        bodega = a;
    }

    public void run() {
        for (int i = 1; i <= 30; i++) {
            bodega.sacar();
        }
    }
}
