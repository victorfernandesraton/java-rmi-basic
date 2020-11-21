import java.rmi.*;

public class Cliente {
    public static void main(String args[]) {
        // arguments supply numbers to sum
        if (args.length != 2) {
            System.err.println("Usage: java Cliente 34 4");
            System.exit(1);
        }
        int num1 = 0;
        int num2 = 0;
        try {
            Somador stub = (Somador) Naming.lookup("rmi://localhost:8000/soma");
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            System.out.println(stub.soma(num1, num2));
        } catch (NumberFormatException nfe) {
            System.out.println("The arguments must be integer.");
            System.exit(1);
        } catch (Exception e) {
        }
    }
}
