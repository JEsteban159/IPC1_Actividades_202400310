package actividad4;

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
//                    do {
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
//                    }while (true);
                break;
                case "dos":
                   System.out.println("Error. Función aún no añadida...");
                break;
                case "tres":
                   System.out.println("Error. Función aún no añadida...");
                break;
                case "cuatro":
                   System.out.println("Error. Función aún no añadida...");
                break;
                case "cinco":
                   System.out.println("Error. Función aún no añadida...");
                break;
                case "seis":
                   System.out.println("Error. Función aún no añadida...");
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