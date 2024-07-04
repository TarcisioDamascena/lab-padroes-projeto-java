import com.tarcisio.gof.facade.Facade;
import com.tarcisio.gof.singletons.SingletonEager;
import com.tarcisio.gof.singletons.SingletonLazy;
import com.tarcisio.gof.singletons.SingletonLazyHolder;
import com.tarcisio.gof.strategy.*;

public class Main {
    public static void main(String[] args) {
        // Teste relacionados ao Dessign Pattern

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("Fim do Singleton \n");

        //Strategy

        Behavior defaultBh = new DefaultBehavior();
        Behavior aggressiveBh = new AggressiveBehavior();
        Behavior defensiveBh = new DefensiveBehavior();

        Robot robot = new Robot();

        robot.setBehavior(defaultBh);
        robot.move();
        robot.move();
        robot.setBehavior(defensiveBh);
        robot.move();
        robot.move();
        robot.setBehavior(aggressiveBh);
        robot.move();
        robot.move();
        System.out.println("Fim do Strategy \n");

        //Facade
        Facade facade = new Facade();
        facade.clientMigration("Tarcisio Damascena", "45000-222");
    }
}