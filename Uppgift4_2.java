import java.util.Scanner;

public class Uppgift4_2
{
   public static void main(String args[])
   {
      
      int lBound = (int) (Math.random () * 50) + 1;
      int uBound = (int) (Math.random () * 50) + 51;
      int svar = (int)(Math.random () * (uBound - lBound + 1)) + lBound;
      int frsok;
      
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("I am thinking of a number from " + lBound + 
            " to " + uBound + "... guess what it is ?");
      frsok = userInput.nextInt();
      
      do
      {
         if (frsok > svar)
         {  
            System.out.println("För högt");
            System.out.println("Ditt svar: ");
            frsok = userInput.nextInt();
            
         }
         else if (frsok < svar) 
         {
           System.out.println("För lågt");
           System.out.println("Ditt svar: ");
           frsok = userInput.nextInt();
         }
      }while(frsok != svar);
      
      System.out.println("Grattis! Det är rätt svar.");
   }
}