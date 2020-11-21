import java.rmi.*;
import java.rmi.server.*;

public class SomadorRemoto extends UnicastRemoteObject implements Somador {
    SomadorRemoto() throws RemoteException {
        super();
    }

    public int soma(int num1, int num2) {
        return num1 + num2;
    }
}
