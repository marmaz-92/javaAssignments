/**
 * En program som visar laddtiden för en elbil med ett batteri 
 * med "lagringseffekten" 35.8 kWh (e-golf) för några vanligt 
 * förekommande kombinationer av ström och spänning vid laddning.
 * I första steget (efter att ha deklarerat konstanter och variabler)
 * kalkylerar programmet laddeffekt (kW) med avrundning till närmaste
 * andra decimaltal (ström * spänning för enfas 230 V och ström x spänning x 
 * roten av 3 för trefas 400V), därefter beräknar det laddningstiden 
 * (batteriets lagringskapacitet / laddeffekt) och med avrundad resultat till 
 * andra decimaltal. 
 * @author Marek Mazur, marmaz-9 
 */
public class Inlamningsuppgift1
{
   public static void main(String[] args)
   {
      final double BATT_KPCTET = 35.8;
      final int SPNNG230 = 230;
      final int SPNNG400 = 400;
      final int STRM10_S230 = 10;
      final int STRM16_S230 = 16;
      final int STRM10_S400 = 10;
      final int STRM16_S400 = 16;
      final int STRM32_S400 = 32;
      
      double ldEffkt1 = 0;
      double ldEffkt2 = 0; 
      double ldEffkt3 = 0;
      double ldEffkt4 = 0;
      double ldEffkt5 = 0;
      
      double ldTid1 = 0;
      double ldTid2 = 0;
      double ldTid3 = 0;
      double ldTid4 = 0;
      double ldTid5 = 0;
      
      
      ldEffkt1 = ((double)STRM10_S230 * SPNNG230) / 1000;
      ldEffkt1 = ldEffkt1 * 100;
      ldEffkt1 = Math.round(ldEffkt1);
      ldEffkt1 = ldEffkt1 / 100;
       
      ldEffkt2 = ((double)STRM16_S230 * SPNNG230) / 1000;
      ldEffkt2 = ldEffkt2 * 100;
      ldEffkt2 = Math.round(ldEffkt2);
      ldEffkt2 = ldEffkt2 / 100;

      ldEffkt3 = ((double)STRM10_S400 * SPNNG400 * Math.sqrt(3)) / 1000;
      ldEffkt3 = ldEffkt3 * 100;
      ldEffkt3 = Math.round(ldEffkt3);
      ldEffkt3 = ldEffkt3 / 100;

      ldEffkt4 = ((double)STRM16_S400 * SPNNG400 * Math.sqrt(3)) / 1000;
      ldEffkt4 = ldEffkt4 * 100;
      ldEffkt4 = Math.round(ldEffkt4);
      ldEffkt4 = ldEffkt4 / 100;

      ldEffkt5 = ((double)STRM32_S400 * SPNNG400 * Math.sqrt(3)) / 1000;
      ldEffkt5 = ldEffkt5 * 100;
      ldEffkt5 = Math.round(ldEffkt5);
      ldEffkt5 = ldEffkt5 / 100;
      
      ldTid1 = BATT_KPCTET / ldEffkt1;
      ldTid1 = ldTid1 * 100;
      ldTid1 = Math.round(ldTid1);
      ldTid1 = ldTid1 / 100;

      ldTid2 = BATT_KPCTET / ldEffkt2;
      ldTid2 = ldTid2 * 100;
      ldTid2 = Math.round(ldTid2);
      ldTid2 = ldTid2 / 100;

      ldTid3 = BATT_KPCTET / ldEffkt3;
      ldTid3 = ldTid3 * 100;
      ldTid3 = Math.round(ldTid3);
      ldTid3 = ldTid3 / 100;

      ldTid4 = BATT_KPCTET / ldEffkt4;
      ldTid4 = ldTid4 * 100;
      ldTid4 = Math.round(ldTid4);
      ldTid4 = ldTid4 / 100;

      ldTid5 = BATT_KPCTET / ldEffkt5;
      ldTid5 = ldTid5 * 100;
      ldTid5 = Math.round(ldTid5);
      ldTid5 = ldTid5 / 100;
      
      System.out.print("Batteri " + BATT_KPCTET + "(kWh)" + "\r" );
      System.out.print("" + "\r" );
      System.out.print("Ström(A)\t" + "Spänning(V)\t" + "Laddeffekt(kW)\t" + "Laddningstid(h)" + "\r" );
      System.out.print("===============================================================" + "\r" );
      System.out.print(STRM10_S230 + "\t\t" + SPNNG230 + "\t\t" + ldEffkt1 + "\t\t" + ldTid1 + "\r" ); 
      System.out.print(STRM16_S230 + "\t\t" + SPNNG230 + "\t\t" + ldEffkt2 + "\t\t" + ldTid2 + "\r" );
      System.out.print(STRM10_S400 + "\t\t" + SPNNG400 + "\t\t" + ldEffkt3 + "\t\t" + ldTid3 + "\r" );
      System.out.print(STRM16_S400 + "\t\t" + SPNNG400 + "\t\t" + ldEffkt4 + "\t\t" + ldTid4 + "\r" );
      System.out.print(STRM32_S400 + "\t\t" + SPNNG400 + "\t\t" + ldEffkt5 + "\t\t" + ldTid5 + "\r" );
   }
} 