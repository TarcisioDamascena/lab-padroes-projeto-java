package com.tarcisio.gof.strategy;

public class DefensiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("Se movendo defensivamente...");
    }
}
