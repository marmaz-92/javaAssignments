/**
 * TÄRNINGSPELET 12
 * 
 * Spelet består av tre tärningar och går ut på att man ska få ihop summan 12 
 * på valfritt antal tärningar. I första steget ber programmet om att användaren ska
 * mata in en av tre möjliga värden (som står för tärningsnummer): 1 - och slå tärning 1; 
 * 2 - och slå tärning 2; 3 - och slå tärning 3 eller mata in q och avbryta spelet (efter 
 * varje omgång (3 kast) kan man avbryta spelet med q). I annat fall får man ett fel meddelande.
 * Därefter beräknar programmet tre slumptal och visar den valda tärningens värde. Eftersom alla 
 * tre värdena är kända från början, använder programmet en konstant "INGTING" med värde "0" 
 * för att gömma icke-valda värden. Därefter väljer man mellan de kvarstående tärningarna 
 * (i två kvarstående och möjliga ordningar) och programmet visar deras värden. 
 * Om summan av dessa tre kast är lika med 12 visar programmet en vinst poäng vid #vinst. 
 * I motsatt fall visar det en poäng vid #förlust. Spelet börjar om med att välja tre nya slumptal 
 * (do-while villkorsmetod) och avslutas när användaren slår 'q' på tangentbordet.
 * 
 * @author Marek Mazur, marmaz-9 
 */
import java.util.Scanner;

public class Inlamningsuppgift3 
{
   public static void main(String[] args)
   {  
      final int VINST_SUMM = 12;
      final int VINST_ANTL = 0;
      final int FRLOST_ANTL = 0;
      final int INGTING = 0;
      final char SLUTA = 'q';
      final char TARN1 = '1';
      final char TARN2 = '2';
      final char TARN3 = '3';
      
      char tarngKast;
      int tarngVrd1, tarngVrd2, tarngVrd3, summan, summanMin23, summanMin3, summanMin2, summanMin13, summanMin1, summanMin12;
      
      System.out.printf("Välkommen till spelet 12. Du ska slå 1-3 tärningar och försöka få summan 12..." + "\r");
      
      do
      {
         tarngVrd1 = (int)(Math.random()*6)+1;
         tarngVrd2 = (int)(Math.random()*6)+1;
         tarngVrd3 = (int)(Math.random()*6)+1;
         summan = tarngVrd1 + tarngVrd2 + tarngVrd3;
         
         summanMin1 = summan - tarngVrd1;
         summanMin2 = summan - tarngVrd2;
         summanMin3 = summan - tarngVrd3;
         summanMin13 = summan - tarngVrd1 - tarngVrd3;
         summanMin12 = summan - tarngVrd1 - tarngVrd2;
         summanMin23 = summan - tarngVrd2 - tarngVrd3;
         
         
         Scanner userInput = new Scanner(System.in);
         
         System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
         tarngKast = userInput.next().charAt(0);
         
         if(tarngKast != TARN1 && tarngKast != TARN2 && tarngKast != TARN3 && tarngKast != SLUTA)
         {
            System.out.printf("Fel inmatning. Mata in 1, 2 eller 3 för att fortsätta med spelet." + "\r");
            System.exit(1);
         }
         
         if(tarngKast == TARN1)
         {
            System.out.printf(tarngVrd1 + " " + INGTING + " " + INGTING + " sum: " + summanMin23 
                  + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
            System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
            tarngKast = userInput.next().charAt(0);
            if(tarngKast == TARN2)
            {
               System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + INGTING + " sum: " + summanMin3 
                     + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
               System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
               tarngKast = userInput.next().charAt(0);
               if(tarngKast == TARN3)
               {
                  if(summan == VINST_SUMM)
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + (VINST_ANTL + 1) + " #förlust: " + FRLOST_ANTL + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
                  else 
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + VINST_ANTL + " #förlust: " + (FRLOST_ANTL + 1) + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
               }
            }
            if(tarngKast == TARN3)
            {
               System.out.printf(tarngVrd1 + " " + INGTING + " " + tarngVrd3 + " sum: " + summanMin2 
                     + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
               System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
               tarngKast = userInput.next().charAt(0);
               if(tarngKast == TARN2)
               {
                  if(summan == VINST_SUMM)
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + (VINST_ANTL + 1) + " #förlust: " + FRLOST_ANTL + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
                  else 
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + VINST_ANTL + " #förlust: " + (FRLOST_ANTL + 1) + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
               }
            }
            if (tarngKast != TARN2 || tarngKast != TARN3)
            {
                  System.out.printf("Fel inmatning. Mata in 1, 2 eller 3 för att fortsätta med spelet." + "\r");
                  System.exit(1);
            } 
         }
         if(tarngKast == TARN2)
         {
            System.out.printf(INGTING + " " + tarngVrd2 + " " + INGTING + " sum: " + summanMin13
                  + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
            System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
            tarngKast = userInput.next().charAt(0);
            if(tarngKast == TARN1)
            {
               System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + INGTING + " sum: " + summanMin3 
                     + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
               System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
               tarngKast = userInput.next().charAt(0);
               if(tarngKast == TARN3)
               {
                  if(summan == VINST_SUMM)
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + (VINST_ANTL + 1) + " #förlust: " + FRLOST_ANTL + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
                  else 
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + VINST_ANTL + " #förlust: " + (FRLOST_ANTL + 1) + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
               }
            }
            if(tarngKast == TARN3)
            {
               System.out.printf(INGTING + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summanMin1 
                     + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
               System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
               tarngKast = userInput.next().charAt(0);
               if(tarngKast == TARN1)
               {
                  if(summan == VINST_SUMM)
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + (VINST_ANTL + 1) + " #förlust: " + FRLOST_ANTL + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
                  else 
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + VINST_ANTL + " #förlust: " + (FRLOST_ANTL + 1) + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
               }
            }
            if (tarngKast != TARN1 || tarngKast != TARN3)
            {
                  System.out.printf("Fel inmatning. Mata in 1, 2 eller 3 för att fortsätta med spelet." + "\r");
                  System.exit(1);
            }
         }
         if(tarngKast == TARN3)
         {
            System.out.printf(INGTING + " " + INGTING + " " + tarngVrd3 + " sum: " + summanMin12
                  + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
            System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
            tarngKast = userInput.next().charAt(0);
            if(tarngKast == TARN2)
            {
               System.out.printf(INGTING + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summanMin1 
                     + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
               System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
               tarngKast = userInput.next().charAt(0);
               if(tarngKast == TARN1)
               {
                  if(summan == VINST_SUMM)
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + (VINST_ANTL + 1) + " #förlust: " + FRLOST_ANTL + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
                  else 
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + VINST_ANTL + " #förlust: " + (FRLOST_ANTL + 1) + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
               }
            }
            if(tarngKast == TARN1)
            {
               System.out.printf(tarngVrd1 + " " + INGTING + " " + tarngVrd3 + " sum: " + summanMin2
                     + " #vinst: " + VINST_ANTL + " #förlust: " + FRLOST_ANTL + "\r");
               System.out.printf("Ange vilken tärning du vill slå [1,2,3](avsluta med q): ");
               tarngKast = userInput.next().charAt(0);
               if(tarngKast == TARN2)
               {
                  if(summan == VINST_SUMM)
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + (VINST_ANTL + 1) + " #förlust: " + FRLOST_ANTL + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
                  else 
                  {
                     System.out.printf(tarngVrd1 + " " + tarngVrd2 + " " + tarngVrd3 + " sum: " + summan 
                           + " #vinst: " + VINST_ANTL + " #förlust: " + (FRLOST_ANTL + 1) + "\r");
                     System.out.printf("Nästa omgång!" + "\r");
                     continue;
                  }
               }
            }
            if (tarngKast != TARN1 || tarngKast != TARN2)
            {
                  System.out.printf("Fel inmatning. Mata in 1, 2 eller 3 för att fortsätta med spelet." + "\r");
                  System.exit(1);
            }
         }
      }while(tarngKast != SLUTA);
 
      System.out.printf("Avslutar spel!");
   }
}
