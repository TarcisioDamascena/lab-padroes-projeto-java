package com.tarcisio.gof.singletons;

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
