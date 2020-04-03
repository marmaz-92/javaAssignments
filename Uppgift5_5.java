import java.util.Scanner;

public class Uppgift5_5 
{
    public static void main (String[] args)
    {
      
       int antlKol = 0;
       int antlRad = 0;
       int peakI = 0; 
       int peakJ = 0;
       double peak = 0;
      
       Scanner userInput = new Scanner (System.in);
       System.out.printf("Hur många värden ska hanteras?" + "\n"
             + "Antalet rader: ");
       antlRad = userInput.nextInt();
      
       System.out.printf("Antalet kolumner: ");
       antlKol = userInput.nextInt();
      
       System.out.println("------------------------------");
       System.out.println("Du valde:" +  "\nAntalet rader - " + antlRad  
             + "\nAntalet kolumner - " + antlKol + "\n------------------------------"
             + "\nMätvärdena: " + "\n");
      
       double [] [] tabell;
       tabell = new double [antlRad] [antlKol];
      
       for (int i = 0; i < tabell.length; i++)
       {
           for (int j = 0; j < tabell[i].length; j++)
           {
               double slump = (Math.random());
               tabell [i] [j] = slump;
           }
       }
      
       for(int i = 0; i < tabell.length; i++) 
       { 
           for (int j = 0; j < tabell[i].length; j++) 
           { 
               System.out.printf("%.3f", tabell [i][j]);
               System.out.print("\t");
           }
           System.out.println();
       }
      
       for(int i = 1; i < antlRad - 1; i++)
       {
           String peakStr;
         
           for(int j = 1; j < antlKol - 1; j++)
           {
               if(tabell [i] [j] > tabell [i-1] [j] && tabell [i] [j] > tabell [i] [j-1] &&
                     tabell [i] [j] > tabell [i] [j+1] && tabell [i] [j] > tabell [i+1] [j])
               {
                   peak = tabell [i] [j];
                   peakI = i;
                   peakJ = j;
               }
           }
       }
      
       System.out.print("\nPeak-värdet ");
       System.out.printf("%.3f", peak);
       System.out.print(" finns i cell " + "[" + peakI + " , " + peakJ + "]:" + "\n");
      
       for(int i = 0; i < tabell.length; i++) 
       { 
           for (int j = 0; j < tabell[i].length; j++) 
           { 
               if(tabell [i] [j] != peak)
               {
                   System.out.print(".\t");
               }
               else
               {
                   System.out.print("x\t");
               }    
           }
           System.out.println();
       }
   }
}
