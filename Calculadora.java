import java.rmi.*;


public interface Calculadora extends Remote  {
    public int sum(int num1, int num2) throws RemoteException;
    public int sub(int num1, int num2) throws RemoteException;
    public int div(int num1, int num2) throws RemoteException;
    public int pow(int num1, int num2) throws RemoteException;
}