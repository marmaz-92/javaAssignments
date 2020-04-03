import java.util.Scanner;

public class Uppgift3_2
{
   public static void main(String[] args)
   {
      double aSidlgd;
      double bSidlgd;
      double dignl;
      double arean;
      
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Skriv sidlängd a: ");
      aSidlgd=userInput.nextDouble();
      
      System.out.print("Skriv sidlängd b: ");
      bSidlgd=userInput.nextInt();
      
      arean = aSidlgd * bSidlgd;
      arean = Math.round(arean);
      
      dignl = (aSidlgd * aSidlgd) + (bSidlgd * bSidlgd);
      dignl = Math.sqrt(dignl);
      dignl = Math.round(dignl);
      
      if (aSidlgd == bSidlgd)
         System.out.println("Detta är en kvadrat. ");
      else
         System.out.println("Detta är en rektangel. ");
      
      System.out.println("Areans värde blir: " + arean + " och diagonal antar värde: " + dignl );
   }
}
   