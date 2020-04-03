public class Uppgift4_32 
{
   public static void main(String[] args)
   {
      int number = 0;
      int k = 0;
      for (int i = 0; i < 5; i++)
      {
          number += ++k;
          System.out.println (number);
      }
   }
}
