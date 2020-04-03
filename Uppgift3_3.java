import java.util.Scanner;

public class Uppgift3_3
{
   public static void main(String[] args)
   {
      int tal1;
      int tal2;
      int tal3;
   
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Mata in tal nr 1: ");
      tal1=userInput.nextInt();
      
      System.out.print("Mata in tal nr 2: ");
      tal2=userInput.nextInt();
      
      System.out.print("Mata in tal nr 3: ");
      tal3=userInput.nextInt();
      
      System.out.println("Det första talet är:" + tal1);
      System.out.println("Det andra talet är:" + tal2);
      System.out.println("Det tredje talet är:" + tal3);
      
      if (tal1 > tal2 && tal1 > tal3)
         System.out.println("Det största talet är: " + tal1);
      if (tal2 > tal1 && tal2 > tal3)
         System.out.println("Det största talet är: " + tal2);
      if (tal3 > tal1 && tal3 > tal2)
         System.out.println("Det största talet är: " + tal3);

      if (tal1 < tal2 && tal1 < tal3)
         System.out.println("Det minsta talet är: " + tal1);
      if (tal2 < tal1 && tal2 < tal3)
         System.out.println("Det minsta talet är: " + tal2);
      if (tal3 < tal1 && tal3 < tal2)
         System.out.println("Det minsta talet är: " + tal3);
   }
}