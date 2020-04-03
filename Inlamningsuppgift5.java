import java.util.Scanner;

public class Inlamningsuppgift5 
{
   private static Scanner in = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      int exitProg = 1;

      System.out.printf("---------------------------------\n");
      System.out.printf("# Test av area och volymmetoderna\n");
      System.out.printf("---------------------------------\n");
      
      do
      {
      int radius;
      int height;      

      radius = getInputInt();
      height = getInputInt();


      System.out.printf("\n%s%d\t", "r: ", radius);
      System.out.printf("%s%d\n", "h: ", height);
      System.out.printf("%s%13.2f\n", "Basytans area:", area(radius));
      System.out.printf("%s%10.2f\n", "Mantelytans area:", area(radius, height));
      System.out.printf("%s%21.2f\n", "Volym:", volume(radius, height));
      exitProg = in.nextInt();
      }while( exitProg == 1);
      
      
      System.out.printf("---------------------------------\n");
      System.out.printf("# Test av bråktalsmetoderna\n");
      System.out.printf("---------------------------------\n");
      
      int nominator;
      int denominator;
      int braktal [] = new int [3];
      
      nominator = in.nextInt();
      denominator = in.nextInt();
      in.nextLine();
      
      braktal = fraction(nominator, denominator);
      
      System.out.printf("%d%s%d%s\t", nominator, "/", denominator, " = ");
      printFraction(braktal);

      
   }
   
   public static int getInputInt() // Metod för inmatningshantering
   {
      int number = Integer.MAX_VALUE;
      while (number == Integer.MAX_VALUE)
      {
         if(in.hasNextInt())
         {
            if(number < 0)
            {
               number = Math.abs(number);
            }
            number = in.nextInt();
         }
         
         
       

      }
      return number;
   }
      
   public static double area(int radius) // BAS AREA
   {
      double basArea;
      basArea = Math.PI * Math.pow(radius, 2);
         
      return basArea;   
   }
   
   public static double area(int radius, int height) // MANTELYTANS AREA
   {
      double mantelArea;
      mantelArea = Math.PI * radius * pythagoras(radius, height);
      
      return mantelArea;
   }
   
   public static double pythagoras(int sideA, int sideB) // HYPOTENUSA
   {
      double hypotns;
      hypotns = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
      
      return hypotns;
   }
   
   public static double volume(int radius, int height) // VOLYM
   {
      double volym;
      volym = (Math.PI * Math.pow(radius, 2) * height) / 3;
      
      return volym;
   }
   
   public static int[] fraction(int nominator, int denominator) // BRÅKTAL
   {
      int [] braktal = new int[3];
      int sgd; // störst gemensam delare
      
      if(nominator == 0)
      {
         braktal [0] = 0;
         braktal [1] = 0;
         braktal [2] = 0;
      }
      
      if(denominator == 0)
      {
         braktal = null;
      }
      
      else
      {
         sgd = sgd(nominator, denominator);

         braktal [0] = nominator / denominator;
         braktal [1] = (nominator % denominator) / sgd;
         braktal [2] = denominator / sgd;
      } 
      return braktal;
   }
   
   public static int sgd(int a, int b) // STÖRST GEMENSAM DELARE
   {
      int c;
      int d;
      
      if(a < b)
      {
         d = a; // d variabel för att registrera a-värdet, annars försvinner det
         a = b;
         b = d;
      }
      
      do
      {
        c = (a % b);
        a = b;
        b = c;
      }while(b != 0);
      
      return a;
   }
   
   public static void printFraction(int[] parts) // BRÅKTALS UTSKRIFT
   {
      // villkor om arrayen är tom
      if(parts == null)
      {
         System.out.printf("%s\n", "\"Error\"");
         System.exit(1);
      }
      // villkor om arrayen innehåller t.ex. { 2, 1, 3 }
      if(parts[0] != 0 && parts[1] != 0 && parts[2] != 0) 
      {
         System.out.printf("%-2d%d%s%d\n", parts[0], parts[1], "/", parts[2]);
      }
      
      // villkor om arrayen innehåller t.ex. { 0, 2, 5 }
      if(parts[0] == 0 && parts[1] != 0 && parts[2] != 0) 
      {
         System.out.printf("%d%s%d\n", parts[1], "/", parts[2]);
      }
      
      // villkor om arrayen innehåller t.ex. { 3, 0, 7 }
      if(parts[0] != 0 && parts[1] == 0 && parts[2] != 0) 
      {
         System.out.printf("%d\n", parts[0]);
      }
      
      // villkor om arrayen innehåller t.ex. { 0, 0, 0 }
      if(parts[0] == 0 && parts[1] == 0 && parts[2] == 0) 
      {
         System.out.printf("%s\n", "0");
      }
   }
}
