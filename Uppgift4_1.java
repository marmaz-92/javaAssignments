import java.util.Scanner;

public class Uppgift4_1
{
   public static void main(String[] args)
   {
       int numb1, numb2;
       
       Scanner userInput = new Scanner(System.in);
       
       System.out.println("Mata in ett tal: ");
       numb1 = userInput.nextInt();
       
       System.out.printf("  x | ");
       
       for (int i = 1; i <=numb1; i++)
       {
           System.out.printf("%3d | ", i);
       }
       
       System.out.println("");
       
       for (int i = 1; i <=numb1; i++)
       {
           System.out.printf("- - - -");
       }
       System.out.println();
       
       for(int b = 1; b <= numb1; b++) 
       {
           System.out.printf("%3d | ", b);
           for(int c = 1; c <= numb1; c++) 
           {
               System.out.printf("%3d | ", (b * c));
           }
           System.out.println();
       }

       
   }
}