import java.rmi.*;

public interface Somador extends Remote {
    public int soma(int num1, int num2) throws RemoteException;
}
