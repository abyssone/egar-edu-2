package ru.absdev;

public class TickTackThread extends Thread {
    TickTack tickTack;
    Runnable method;

    public TickTackThread(TickTack tickTack, Runnable method) {
        this.method = method;
        this.tickTack = tickTack;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            method.run();
        }
        synchronized (tickTack) {
            tickTack.notify();
        }
    }
}