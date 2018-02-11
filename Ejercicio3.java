/**
 * Problem 4: Number of  zeroes in n!
 * El proposito del ejercicio es el de hayar el numero de zeros en el factorial de un numero.
 * @author Andres
 * @version 1
 */

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException; 
 
class Factorial 
{
    // Funcion que retorna numero de zeros en n factorial
    static int findTrailingZeros(int n)
    {
        // Inicia resultado
        int count = 0;
 
        // Divide por exponentes de 5
        for (int i=5; n/i>=1; i *= 5)
            count += n/i;
 
        return count;
    }
     
    // Maneja el programa
    public static void main (String[] args) 
    {
    
    boolean bError = true;
    	// Re inicia la funcion si el usuario no pone un numero valido
 	while(bError)
 	{
 	// Prevee error en caso de que el usuario no ponga un numero valido
 	try
        {
    
    	Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese el numero");
        int n = sc.nextInt();
        System.out.println("El numero de 0s en "+ n +"! es "
                                    + findTrailingZeros(n));
                                    bError = false;
              
         }
         
         catch(InputMismatchException exception) 
         {
         System.out.println("Error: esto no es un numero");
         }    
 	
 	
 	}
    
                        
                                    
    }
    
}
