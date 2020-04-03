import java.util.Arrays;
import java.util.Scanner;

public class Uppgift5_1 
{
    public static void main (String [] args)
    {
        int size = 0;
        int value = 0;
           
        Scanner userInput = new Scanner (System.in);
        System.out.println("Hur många värden ska registreras? ");
        size = userInput.nextInt();
        
        System.out.println("Registrera värden: ");
        
        int[] intArray;
        intArray = new int[size];
       
        for (int i = 0; i < size; i++)
        {
           System.out.println("Värde " + (i + 1) + ": ");
           value = userInput.nextInt();
           intArray[i] = value;
        }
        
        System.out.println ("Värdena i ursprunglig ordning: " + "\r");
        
        for (int i = 0; i < size; i++)
        {
            System.out.print (intArray[i] + " ");
        }
        System.out.println ();
        
        
        System.out.println ("Värdena i sorterad ordning: " + "\r");
        
        Arrays.sort(intArray);
        
        for (int i = 0; i < size; i++)
        {
            System.out.print (intArray[i] + " ");
        }
        System.out.println ();
        
        int max = intArray[0];
        
        for (int i = 0; i < size; i++)
        {
            if(intArray[i] > max)
            {
               max = intArray[i];
            }
        }
        System.out.println("Största värde: " + max + "\r");
        
        int min = intArray[0];
       
        for (int i = 0; i < size; i++)
        {
            if(intArray[i] < min)
            {
               min = intArray[i];
            }
        }
        System.out.println ("Minsta värde: " + min);
    }

}
