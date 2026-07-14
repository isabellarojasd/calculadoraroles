import java.util.concurrent.locks.ReentrantLock;

public class Cuenta {
    private int saldo = 500;
    //volatile por si se cierra la cuuenta todos los hilos lo van a ver
    private volatile boolean activa = true;

}
