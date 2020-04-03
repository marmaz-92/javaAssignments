import java.util.Arrays;
import java.util.Scanner;

public class Uppgift5_4 
{
    public static void main(String[] args)
    {
       int antalKast, kast, length;
       double summan = 0;
       double gnmsnitt, median, antalKastDbl;
       int[] arrayKast;
       int[] arrayKastSum = new int [6];
       
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Antal försök: ");

       antalKast = keyboard.nextInt();
       arrayKast = new int [antalKast];
       
       System.out.println();
       
       for(int i = 0; i < antalKast; i++)
       {
           kast = (int) (Math.random() * 6) + 1;
           arrayKast[i] = kast;
           summan += arrayKast[i];
           
           switch (kast)
           {
               case 1: 
                  arrayKastSum [0] += 1;
                  break;
               case 2: 
                  arrayKastSum [1] += 1;
                  break;
               case 3: 
                  arrayKastSum [2] += 1;
                  break;
               case 4: 
                  arrayKastSum [3] += 1;
                  break;
               case 5: 
                  arrayKastSum [4] += 1;
                  break;
               case 6:
                  arrayKastSum [5] += 1;
                  break;
           }  
       }
       
       antalKastDbl = antalKast;
       gnmsnitt = Math.round((summan / antalKast) * 100.0) / 100.0;
       
       System.out.println("Genomsnitt: " + gnmsnitt);
       
       Arrays.sort(arrayKast);
       
       if(antalKast % 2 == 0)
       {
          median = ((double)arrayKast[arrayKast.length / 2] + 
                (double)arrayKast[arrayKast.length / 2 - 1]) / 2;
       }
       else
       {
          median = (double)arrayKast[arrayKast.length / 2];
       }
       
       System.out.println("Median: " + median);
       System.out.println();
       
       System.out.println("Antal kast som gav:" + "\n" + "1 \t" + "2\t" + "3\t" +
             "4\t" + "5\t" + "6\t");
       
       for (int i = 0; i < arrayKastSum.length; i++)
       {
           System.out.print (arrayKastSum[i] + "\t");
       }
    }
}
