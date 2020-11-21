import java.rmi.*;
import java.rmi.registry.*;

public class Servidor {
    public static void main(String args[]) {
        try {
            Somador stub = new SomadorRemoto();
            Naming.rebind("rmi://localhost:8000/soma", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
