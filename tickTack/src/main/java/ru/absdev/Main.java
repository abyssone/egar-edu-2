package ru.absdev;

public class Main {
    public static void main(String[] args){
        TickTack tickTack = new TickTack();

        TickTackThread thread1 = new TickTackThread(tickTack, tickTack::tick);
        TickTackThread thread2 = new TickTackThread(tickTack, tickTack::tack);

        thread1.start();
        thread2.start();
    }
}