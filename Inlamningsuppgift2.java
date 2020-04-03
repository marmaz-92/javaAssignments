/**
 * Ett program som beräknar hur mycket pengar solceller 
 * genererar per dag (ett dygn) baserat på antalet soltimmar. 
 * Användaren matar in datum och vilken tid solen går upp 
 * och vilken tid den går ner. I första steget räknar programmet 
 * ut antalet soltimmar (växlar timmar till minutter, lägger ihop
 * med antal minutter och konverterar till ett värde avrundad till
 * andra decimaltal). Därefter beräknar det vilken produktion som 
 * sker (Produktion (kWh) = Solinstrålning (Wh/m2/timme) x soltimmar
 * x storlek (m2) x verkningsgrad, ger ett avrundat värde till andra 
 * decimaltal)och slutligen vilken vinst försäljning av hela produktionen 
 * ger (produktion * elpriset, ett värde som är avrundat till andra decimaltal).
 * 
 * 
 * @author Marek Mazur, marmaz-9
 */

import java.util.Scanner;

public class Inlamningsuppgift2 
{
   public static void main(String[] args)
   {
      final int SOLPNLLR_ANTL = 26; // antal solpaneller
      final double SOLPNL_AREA = 1.7 * 1; // area av varje panel (m x m)
      final double SOLPNLLR_AREA = SOLPNLLR_ANTL * SOLPNL_AREA; // area av alla paneller
      final int  SOLPNLLR_KPCT =  290;  // max strömproduktion (W)
      final int SOLINSTRL = 166; // Solinstrålningen i Skellefteå en solig sommardag (Wh/m2/timme)
      final double SOLCELL_VRKGRD = 0.2; // Solcellens verkningsgrad  (20% av solinstrålningen)
      final double EL_PRIS = 0.9; // Elpriset (inklusive 60 öre skatterabatt)
      final int MINTTR = 60; // antal minutter i en timme
      final int MIN_TIM = 0; // min. värde för timmar
      final int MAX_TIM = 24; // max. värde för timmar
      final int MIN_MINT = 0; // min. värde för minutter
      final int MAX_MINT = 59; // max. värde för minutter
      final int MIN_DAG = 1; // min. värde för dagar
      final int MAX_DAG =  31; // max. värde för dagar
      final int MIN_MAN = 6; // min. värde för månader
      final int MAX_MAN = 7; // max. värde för månader
      final int MIN_AR = 0; // min. värde för år 
      final int MAX_AR = 99; // max. värde för år 
      final int AVRUND1 = 10; // avrundning faktor 1
      final int AVRUND2 = 100;  // avrundning faktor 2
      
      int talDag, talManad, talAr, timSolUppgng, minSolUppgng, timSolNdgng, minSolNdgng, antlTim, antlMin;
      double antlMinFinal, antlTimFinal, produktn, vinst;
      
      Scanner userInput = new Scanner(System.in);
      userInput.useDelimiter(":|-|\\s+");
      
      System.out.print("Skriv dagens datum [yy-mm-dd]> ");  
      talAr = userInput.nextInt();
      if (talAr < MIN_AR || talAr > MAX_AR)
      {
         System.out.println("Talet för år måste vara i intervall 00-99");
         System.exit(1);
      }
      talManad = userInput.nextInt();
      if (talManad < MIN_MAN || talManad > MAX_MAN)
      {
         System.out.println("Talet för månader måste vara i intervall 06-07 (juni-juli)");
         System.exit(1);
      }
      talDag = userInput.nextInt();
      if (talDag > MAX_DAG || talDag < MIN_DAG)
      {
         System.out.println("Talet för dagar måste vara i intervall 01-31");
         System.exit(1);
      }
      userInput.nextLine();
      
      System.out.print("Skriv in tidpunkt soluppgång [hh:mm]> ");
      timSolUppgng = userInput.nextInt();
      if (timSolUppgng > MAX_TIM || timSolUppgng < MIN_TIM)
      {
         System.out.println("Talet för timmar måste vara i intervall 00-24");
         System.exit(1);
      }
      minSolUppgng = userInput.nextInt();
      if (minSolUppgng > MAX_MINT || minSolUppgng < MIN_MINT)
      {
         System.out.println("Talet för minutter måste vara i intervall 00-59");
         System.exit(1);
      }
      userInput.nextLine();
      
      System.out.print("Skriv in tidpunkt solnedgång [hh:mm]> ");
      timSolNdgng = userInput.nextInt();
      if (timSolNdgng > MAX_TIM || timSolNdgng < MIN_TIM)
      {
         System.out.println("Talet för timmar måste vara i intervall 00-24");
         System.exit(1);
      }
      minSolNdgng = userInput.nextInt();
      if (minSolNdgng > MAX_MINT || minSolNdgng < MIN_MINT)
      {
         System.out.println("Talet för minutter måste vara i intervall 00-59");
         System.exit(1);
      }
      userInput.nextLine();
      
      antlTim = timSolNdgng - timSolUppgng;
      antlMin = minSolNdgng - minSolUppgng;
      antlMinFinal = antlTim * MINTTR; // konvertion från timmar till minutter
      antlMinFinal += antlMin;
      antlTimFinal = antlMinFinal / MINTTR; // konvertion igen till timmar
      antlTimFinal = antlTimFinal * AVRUND2; // avrundning till andra decimaltal
      antlTimFinal = Math.round(antlTimFinal);
      antlTimFinal = antlTimFinal / AVRUND2;
      
      produktn = (SOLINSTRL * SOLCELL_VRKGRD) * antlTimFinal * SOLPNLLR_AREA;
      produktn /= AVRUND1; 
      produktn = Math.round(produktn); // avrundning till närmast heltal
      produktn /= AVRUND2; // konvertion från Wh till KWh och tal avrundad till andra decimaltal
      
      vinst = produktn * EL_PRIS;
      vinst *= AVRUND2; 
      vinst = Math.round(vinst); // avrundning till närmast heltal
      vinst /= AVRUND2; 
      
      System.out.printf("=========================================\n" + "Soltimmar: " + antlTimFinal + "\n" 
      + "Produktionen " + talDag + "-" + talManad + "-" + talAr + " blir: " + produktn + " kWh " 
            + "till ett värde av: " + vinst + " kr" );
   }

   
}
