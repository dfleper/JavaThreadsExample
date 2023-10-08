package com.dfleper;

public class Quesero extends Thread {

    private Bodega bodega;

    public Quesero(Bodega a) {
        bodega = a;
    }

    public void run() {
        for (int i = 1; i <= 30; i++) {
            bodega.guardar();
        }
    }
}
