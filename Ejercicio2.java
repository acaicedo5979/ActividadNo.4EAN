/**
 * Esta clase nos permite hallar la suma de 2 enteros
 * Comprendidos en un rango de 1 y 100
 * Necesito preguntarle al usuario los dos enteros a sumar
 * @author Camilo
 * @version (EAN.)
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {

    public static void main(String[] args)
    
    {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        
        try
	{
        System.out.println("Ingrese dos números entre 1 y 100");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        if (num1 != (int)num1 || num2 != (int)num2 || num1 > 100 || num1 < 1 || num2 > 100 || num2 < 1) {
        
        System.out.println("Error: revise las instrucciones nuevamente");
        
        }

        else {
                
        sc.close();
        sum = num1 + num2;
        System.out.println("Suma de estos números: "+sum);
        }
        
        }
        
        catch(InputMismatchException exception)
	{
  	System.out.println("Esto no es un número entero");
	}   
	     
 
    }
}
