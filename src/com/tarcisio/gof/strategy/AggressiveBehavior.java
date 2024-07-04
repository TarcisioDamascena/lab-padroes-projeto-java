package com.tarcisio.gof.strategy;

public class AggressiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Se movendo agressivamente...");
    }
}
