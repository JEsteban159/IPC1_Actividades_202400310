package actividad4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Actividad4 {
    
    public static void main(String[] args) {
        Scanner contenedorEntradas = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion (Escriba el número Ej. uno): ");

            String opcion = contenedorEntradas.nextLine();
            
            switch (opcion) {
                case "uno":
                    do {
                        Scanner sumar = new Scanner(System.in);
                        System.out.println("Ingrese el primer número: ");
                        int a=sumar.nextInt();
                        System.out.println("Ingrese el segundo número: ");
                        int b=sumar.nextInt();
                        int suma = a + b;
                        System.out.println("La suma es: " + suma);
                    
                        System.out.println("Quiere repetir S/N: ");
                        String confirmacion = contenedorEntradas.nextLine();
                        if ("N".equals(confirmacion)) break;
                    }while (true);
                break;
               
                case "dos":
                    do {
                        Scanner restar = new Scanner(System.in);
                        System.out.println("Ingrese el primer número: ");
                        int a=restar.nextInt();
                        System.out.println("Ingrese el segundo número: ");
                        int b=restar.nextInt();
                        int resta = a - b;
                        System.out.println("La resta es: " + resta);
                        
                        System.out.println("Quiere repetir S/N: ");
                        String confirmacion = contenedorEntradas.nextLine();
                        if ("N".equals(confirmacion)) break;
                    }while (true);
                break;
                
                case "tres":
                    do {
                        Scanner multiplicar = new Scanner(System.in);
                        System.out.println("Ingrese el primer número: ");
                        int a=multiplicar.nextInt();
                        System.out.println("Ingrese el segundo número: ");
                        int b=multiplicar.nextInt();
                        int multiplicacion = a * b;
                        System.out.println("La multiplicación es: " + multiplicacion);
                        
                        System.out.println("Quiere repetir S/N: ");
                        String confirmacion = contenedorEntradas.nextLine();
                        if ("N".equals(confirmacion)) break;
                    }while (true);
                break;
               
                case "cuatro":
                    do {
                        Scanner dividir = new Scanner(System.in);
                        System.out.println("Ingrese el primer número: ");
                        double a=dividir.nextDouble();
                        System.out.println("Ingrese el segundo número: ");
                        double b=dividir.nextDouble();
                        double division = a / b;
                        System.out.printf("La división es: %.2f%n", division);
                        
                        System.out.println("Quiere repetir S/N: ");
                        String confirmacion = contenedorEntradas.nextLine();
                        if ("N".equals(confirmacion)) break;
                    }while (true);
                break;
               
                case "cinco":
                    do {
                        Scanner potenciar = new Scanner(System.in);
                        System.out.println("Ingrese un número: ");
                        int a=potenciar.nextInt();
                        int potenciacioncua = a * a;
                        int potenciacioncub = a * a * a;
                        System.out.println("La potenciación al cuadrado es: " + potenciacioncua);
                        System.out.println("La potenciación al cubo es: " + potenciacioncub);
                        
                        System.out.println("Quiere repetir S/N: ");
                        String confirmacion = contenedorEntradas.nextLine();
                        if ("N".equals(confirmacion)) break;
                    }while (true);
                break;
               
                case "seis":
                    do {
                        Scanner raiz = new Scanner(System.in);
                        System.out.println("Ingrese un número: ");
                        double a=raiz.nextDouble();
                        double raizcuadrada = sqrt(a);
                        System.out.printf("La raiz cuadrada es: %.2f%n", raizcuadrada);
                        
                        System.out.println("Quiere repetir S/N: ");
                        String confirmacion = contenedorEntradas.nextLine();
                        if ("N".equals(confirmacion)) break;
                    }while (true);
                break;    
                
                case "siete":
                    salir = true;
                break;
                default:
                    System.out.println("Opcion invalida. Por favor escribir el número...");
            }
        }
        contenedorEntradas.close();
    }
}