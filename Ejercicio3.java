/**
 * Problem 4: Number of  zeroes in n!
 * El proposito del ejercicio es el de hayar el numero de zeros en el factorial de un numero.
 * @author Andres
 * @version 1
 */

import java.io.*;
 
class Ejercicio3
{

    static int findTrailingZeros(int n)
    {

        int count = 0;


        for (int i=5; n/i>=1; i *= 5)
            count += n/i;
 
        return count;
    }
     

    public static void main (String[] args) 
    {
        /* Respuesta para el numero 25 */
        int n = 25;
        System.out.println("Trailing 0s in "+ n +"! is "
                                    + findTrailingZeros(n));
    }
}
