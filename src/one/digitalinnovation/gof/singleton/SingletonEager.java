package one.digitalinnovation.gof.singleton;

/**
 * 
 * Singleton "apressado"
 * 
 * @author Ana Luisa Barbosa
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
