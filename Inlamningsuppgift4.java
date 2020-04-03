/**
 * Ett program som hanterar slumptal.
 * 
 * Först ska användaren mata in hur många slumptal i intervallet 0 – 999 som önskas 
 * (obegränsat antal). Om användaren matar in ett tal mindre än 1 visas då ett felmeddelande
 * och prorammet avslutas. Därefter beräknar programmet ett slumptal för varje variabel som finns 
 * i arrayen (intArray) och genererar en utskrift (for-loopen) med slumptalen i osorterad ordning. 
 * För att sortera tal från det minsta till det största värdet (och vice versa) använder programmet 
 * nästlade for-satser. Dessutom skapas en kopia av arrayen (intArrayTemp) för att möjliggöra 
 * den andra sorteringen (från det största till det minsta värdet). Från den första arrayen 
 * får vi en utskrift med jämna tal (värden testas med modulo operator). Sedan får vi en utskrift
 * med udda tal från den kopierade arrayen (intArrayTemp). När programmet skriver ut dessa tal 
 * (for-loop) beräknar det också hur många jämna och odda tal får vi (uddaTal och jamnaTal). 
 * Slutligen får vi även en utskrift med antal jämna och odda tal.  
 * 
 * 
 * @author Marek Mazur, marmaz-9 
 */
import java.util.Scanner;

public class Inlamningsuppgift4 
{
   public static void main (String[] args)
   {
      int sizeTal, maxTal, minTal;
      int [] intArray;
      int [] intArrayTemp;
      int length1;
      int length2;
      int tempry = 0;
      int tempry2 = 0;
      int uddaTal = 0;
      int jamnaTal = 0;
      
      Scanner userInput = new Scanner (System.in); // Inmatning
      System.out.printf("Hur många slumptal i intervallet 0 - 999 önskas? ");
      sizeTal = userInput.nextInt();
      
      intArray = new int[sizeTal];
      length1 = intArray.length;
      
      if (length1 <= 0) // Felhantering
      {
         System.out.printf("Fel inmatning! Bara tal frå och med 1 är tillåtna.");
         System.exit(1);
      }
      
      for (int i = 0; i < sizeTal; i++) // Slumptal
      {
         intArray[i] = (int)(Math.random() * 1000) + 1;
      }
      
      System.out.printf ("\n" + "Här är de slumpade talen: " + "\n"); // Utskrift med 
                                                                      // osorterad ordning
      
      for (int i = 0; i < sizeTal; i++)
      {
          System.out.print (intArray[i] + " ");
      }
      
      System.out.printf("\n");
      
      for(int i = 0; i < length1; i++) // Sortering av intArray (från det minsta till det största)
      {
          minTal = i;
          for(int k = i+1; k < length1; k++)
          {
              if(intArray[k] < intArray[minTal])
              {
                  minTal = k;
              }
          }
          tempry = intArray[i];
          intArray[i] = intArray[minTal];
          intArray[minTal] = tempry;
      }
      
      System.out.printf("\n");
      System.out.printf ("Här är de slumpade talen ordnade:" + "\n");
      
      for(int i=0; i < intArray.length; i++) // Utskrift med jämna tal från intArray
      { 
         if(intArray[i] % 2 == 0)
         {  
            System.out.printf(intArray[i] + " "); 
            jamnaTal += 1;
         }  
      }
      
      System.out.printf("- ");
      
      intArrayTemp = new int[intArray.length]; // kopia av intArray
      
      for(int i = 0; i < intArray.length; i++) // kopiering av intArrays värden till intArrayTemp
      {
         intArrayTemp[i] = intArray[i];
      }
      length2 = intArray.length;
      
      for(int i = 0; i < length2; i++) // Sortering av intArrayTemp (från det största 
                                       // till det minsta)
      {
          maxTal = i;
          for(int k = i+1; k < length2; k++)
          {
              if(intArrayTemp[k] > intArrayTemp[maxTal])
              {
                  maxTal = k;
              }
          }
          tempry2 = intArrayTemp[i];
          intArrayTemp[i] = intArrayTemp[maxTal];
          intArrayTemp[maxTal] = tempry2;
      }
      
      for(int i=0; i < intArrayTemp.length; i++) // utskrift med odda tal från intArrayTemp
      { 
         if(intArray[i] % 2 != 0)
         {  
            System.out.printf(intArrayTemp[i] + " "); 
            uddaTal += 1;
         }  
      }
      
      System.out.printf("\n");

      System.out.printf("\n" + "Av ovanstående " + sizeTal + " tal var " +  jamnaTal +
            " jämna och " + uddaTal + " udda " + "\r");
   }
}
