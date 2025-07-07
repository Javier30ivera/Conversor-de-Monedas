import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsultarAPI consulta = new ConsultarAPI();
        Scanner leer = new Scanner(System.in);
        String op = "";
        String base = "";
        String destino = "";
        double conversion= 0;
        double moneda = 0;
        double resultado = 0;

        while (true) {
            System.out.println("Conversor de monedas");
            System.out.println("Elige la moneda base:");
            System.out.println("1) Peso MXN");
            System.out.println("2) Dólar USD");
            System.out.println("3) Euro EUR");
            System.out.println("4) Yen JPY");
            System.out.println("5) Libra Esterlina GBP");
            System.out.println("6) Peso Colombiano COL");
            System.out.println("7) Dolar Canadiense CAD");
            System.out.println("Presiona 's' para salir.");

            op = leer.next();

            if (op.equalsIgnoreCase("s")) {
                System.out.println("Saliendo del conversor. ¡Hasta luego!");
                break;
            }

            base = asignarValor(op);

            if (base.equals("INVALID")) {
                System.out.println("Opción de moneda base inválida. Por favor, elige un número del 1 al 7.");
                continue;
            }

            System.out.println("Elige la moneda a convertir:");
            System.out.println("1) Peso MXN");
            System.out.println("2) Dólar USD");
            System.out.println("3) Euro EUR");
            System.out.println("4) Yen JPY");
            System.out.println("5) Libra Esterlina GBP");
            System.out.println("6) Peso Colombiano COL");
            System.out.println("7) Dolar Canadiense CAD");

            op = leer.next();
            destino = asignarValor(op);

            if (destino.equals("INVALID")) {
                System.out.println("Opción de moneda destino inválida. Por favor, elige un número del 1 al 7.");
                continue;
            }

            System.out.println("Has elegido convertir de " + base + " a " + destino);
            System.out.println("Ingresa la cantidad en "+base+" a converitr a "+destino+":");
            moneda = leer.nextFloat();
            conversion= consulta.convertir(base,destino);
            resultado=moneda*conversion;
            System.out.println("De "+base+" a "+destino+" son: "+resultado+" "+destino);

            System.out.println("\n---");

        }
    }

    public static String asignarValor(String op) {
        switch (op) {
            case "1":
                return "MXN";
            case "2":
                return "USD";
            case "3":
                return "EUR";
            case "4":
                return "JPY";
            case "5":
                return "GBP";
            case "6":
                return "COL";
            case "7":
                return "CAD";
            default:
                return "INVALID";
        }
    }
}