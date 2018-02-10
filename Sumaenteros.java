/**
 * Esta clase nos permite hallar la suma de 3 enteros
 * Necesito preguntarle al usuario los tres enteros a sumar
 * @author Camilo
 * @version (Complete the given function which takes 3 integers as input. Return the sum of the 3 integers as output.)
 */

import java.util.Scanner;

public class Sumaenteros
{
    public static void main(String[] args)
    {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        int suma;
        
        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Escriba el tercer entero: ");
        numero3 = entrada.nextInt();
        
        suma = numero1 + numero2 + numero3;
        
        System.out.printf("La suma es %d\n", suma);
    }

}
