package com.tarcisio.gof.strategy;

public class DefaultBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Se movendo normalmente...");
    }
}
