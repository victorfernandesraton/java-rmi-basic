import java.rmi.*;

public class ClienteCalculadora {
    public static void main(String args[]) {
        // arguments supply numbers to sum
        if (args.length != 3) {
            System.err.println("Usage: java Cliente 34 4");
            System.exit(1);
        }
        int num1 = 0;
        int num2 = 0;
        String opr;
        try {
            Calculadora stub = (Calculadora) Naming.lookup("rmi://localhost:8000/calc");
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            opr = args[2];
            switch (opr) {
                case "+":
                    System.out.println(stub.sum(num1, num2));
                    break;
                case "-":
                    System.out.println(stub.sub(num1, num2));
                    break;
                case "/":
                    System.out.println(stub.div(num1, num2));
                    break;
                case "X":
                    System.out.println(stub.pow(num1, num2));
                    break;
                default:
                    System.out.println("Operador inválido");
                    break;
            }
            // System.out.println(stub.soma(num1, num2));
        } catch (NumberFormatException nfe) {
            System.out.println("The arguments must be integer.");
            System.exit(1);
        } catch (Exception e) {
        }
    }
}
