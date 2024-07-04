package com.tarcisio.gof;

/**
 * Singleton "preguiçoso".
 *
 * @author DamasX
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return  instancia;
    }
}
