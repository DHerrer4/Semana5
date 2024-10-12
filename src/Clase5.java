import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase5 {
    private static final int MAX_HISTORIAL = 10;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] historial = new String[MAX_HISTORIAL];
        int contadorHistorial = 0;
        boolean continuar = true;

        System.out.println("=== Calculadora Científica ===");

        while (continuar) {
            System.out.println("\nSelecciona una operación: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Ver Historial");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            int opcion = 0;
            try{
                opcion = entrada.nextInt();
            } catch (InputMismatchException e){
                System.out.println("ERR:Opción invalida!. Intente de nuevo.");
                entrada.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    double[] sumandos = obtenenrDosNumeros(entrada);
                    double suma = sumandos[0] + sumandos[1];
                    System.out.println("Resulatado: " + suma);
                    agregarAlHistorial(historial, contadorHistorial++, operacion sumandos[0] + " + " + sumandos[1] + " = " );
                    break;
                case 2:
                    double[] restandos = obtenenrDosNumeros(entrada);
                    double resta = restandos[0] + restandos[1];
                    System.out.println("Resulatado: " + resta);
                    agregarAlHistorial(historial, contadorHistorial++, operacion  restandos[0] + " - " + restandos[1] +System.out.println("2");
                    break;
                case 3:
                    double[] factores = obtenenrDosNumeros(entrada);
                    double suma = sumandos[0] + sumandos[1];
                    System.out.println("Resulatado: " + suma);
                    agregarAlHistorial(historial, contadorHistorial++, operacion sumandos[0] + " * " + sumandos[1] +System.out.println("3");
                     break;
                case 4:
                    double[] dividendos = obtenenrDosNumeros(entrada);
                    double division = dividendos[0] + dividendos[1];
                    System.out.println("Resulatado: " + division);
                    agregarAlHistorial(historial, contadorHistorial++, operacion sumandos[0] + " / " + sumandos[1] +System.out.println("4");
                    break;
                case 5:
                    System.out.println("Ingresa la base: ");
                    double base = leerNumero(entrada);
                    System.out.println("Ingresa el exponente: ");
                    double exponente = leerNumero(entrada);
                    double potencia = Math.pow(base, exponente);
                    System.out.println("Resultado: " + potencia);
                    agregarAlHistorial(historial, contadorHistorial++, operacion [0] + " + " + sumandos[1] +System.out.println("5");
                    break;
                case 6:
                    System.out.println("Ingresa el numero: ");
                    double numero = leerNumero(entrada);
                    if (numero < 0) {
                        System.out.println("ERROR: El numero no puede ser negativo.");
                    } else {
                        System.out.println("Resultado: " + numero);
                        agregarAlHistorial(historial, contadorHistorial++, operacion sumandos[0] + " + " + sumandos[1] +
                    }
                    break;
                case 7:
                    System.out.println("Historial de Operaciones");
                    if (contadorHistorial == 0) {
                        System.out.println("Hisotrilal Vacio");
                    } else {
                        for (int i = 0; i < contadorHistorial; i++) {
                            System.out.println((i + 1) + ". "+ historial[i]);
                        }
                    }
                    break;
                case 8:
                    System.out.println("Desea salir? (S/N): ");
                    char respuiesta = entrada.nextLine().toUpperCase().charAt(0);
                    continuar = (respuiesta == 'S') ? true : false;
                    break;
                default:
                    System.out.println("ERR:Opción invalida!. Intente de nuevo.");
            }

            if (contadorHistorial >= MAX_HISTORIAL) {
                System.out.println("Historial lleno. No se puede almacenar mas operaciones.");
                contadorHistorial = MAX_HISTORIAL;
            }
        }

        System.out.println("Hatsa luego!");
        entrada.close();
    }

    private static double[] obtenenrDosNumeros(Scanner entrada) {
        double num1 = 0, num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingresa el primer numero: ");
                num1 = entrada.nextDouble();
                System.out.print("Ingresa el segundo numero: ");
                num2 = entrada.nextDouble();
                entradaValida = true;
            } catch (Exception e){
                System.out.println();
            }
        }
    }
}
