import java.rmi.*;
import java.rmi.server.*;

public class CalculadoraRemota extends UnicastRemoteObject implements Calculadora {
    CalculadoraRemota() throws RemoteException {
        super();
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    public int div(int num1, int num2) {
        // if (num2 == 0) {
        //     throws new Exception("Numero inválido")
        // }
        return num1 / num2;
    }
    public int pow(int num1, int num2) {
        return num1 * num2;
    }

}
