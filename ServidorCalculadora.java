import java.rmi.*;
import java.rmi.registry.*;

public class ServidorCalculadora {
    public static void main(String args[]) {
        try {
            Calculadora stub = new CalculadoraRemota();
            Naming.rebind("rmi://localhost:8000/calc", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
