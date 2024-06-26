import java.util.Scanner;
//Nombre: Michel de los Ángeles Pineda Romero, 1M1-S, 2024-1364U.
//Crear un sistema que acepte 3 números diferentes, sumen los dos menores y que resten los mayores, y cual es el número mayor.

public class App {

    public static int num1;
    public static int num2;
    public static int num3;

    public static void main(String[] args) throws Exception {

        //3 numeros diferentes.

        Scanner leer = new Scanner(System.in);

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }

        } while (num1 == num2 || num1 == num3 || num2 == num3);

        //Los números más pequeños.
        int peq = Math.min(num1, Math.min(num2, num3));
        int peq2 = Math.max(Math.min(num1, num2), Math.min(num2, num3));

        // Los números más grandes
        int grand = Math.max(num1, Math.max(num2, num3));
        int grand2 = Math.min(Math.max(num1, num2), Math.max(num2, grande));

        //La suma de los números más pequeños.
        int suma = peq + peq2;
        
        //La resta de los números más grandes.
        int resta = grand - grand2;

        //Resultado de las operaciones 
        System.out.println("La suma de los números más pequeños es: " +suma);
        System.out.println("La resta de los números más grandes es: " +resta);

        //El número mayor 
        int numgrande = Math.max(Math.max(num1, num2), num3);
        System.out.println("El número más grande es: " + numgrande);

    }
}
