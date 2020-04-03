import java.util.Scanner;

public class Uppgift4_5 
{
   public static void main (String[] args)
   {
      String frase;
      int reslt = 0; 
      double resltDel;
      
      Scanner userInput = new Scanner(System.in);
      System.out.printf("Mata in ett tal: ");
      frase = userInput.nextLine();
      
      int length = frase.length();
      
      
      for(int i = 0; i < length; i++) 
      { 
         char sign = frase.charAt(i);
         
         if (sign >= '\u0041')
         {
            System.out.print("Bara siffror är tillåtna. Försök igen!");
            System.exit(1);
         }
      }
      
      for(int i = length - 1; i >= 0; i--) 
      {
         reslt += (frase.charAt(i) - 48) * Math.pow(10, (length - 1) - i);
      }
      
      resltDel = reslt / 10.0;
      
      System.out.println("Resultatet: " + reslt);
      System.out.println("Resultatet delat med 10.0: " + resltDel);
   }
}
