import java.util.Scanner;

public class Uppgift4_4 
{
   public static void main (String[] args)
   {
      String frase;
      int amountVov = 0;
      int amountCons = 0;
      int amountPunct = 0;
      
      Scanner userInput = new Scanner(System.in);
      System.out.printf("Type in text: ");
      frase = userInput.nextLine();
      
      int length = frase.length();
      
      for(int i = 0; i < length; i++) 
      { 
         char sign = frase.charAt(i);
         
         if (sign == '\u002e' || sign == '\u0021' || sign == '\u003f' || sign == '\u002c' || sign == '\u003b' 
               || sign == '\u003a' || sign == '\u002d' || sign == '\u0020')
         {
            amountPunct++;
         }
         
         if(sign == 'a' || sign == 'A' || sign == 'e' || sign == 'E' || sign == 'i' || sign == 'I' || sign == 'o' 
               || sign == 'O' || sign == 'u' || sign == 'U') 
         { 
            amountVov++; 
         } 
         
         else if ((sign >= 'a' && sign <='z') || (sign >= 'A' && sign <= 'Z'))
         {
            amountCons++; 
         } 
      }
  
      System.out.println("Number of vowels: " + amountVov);
      System.out.println("Number of consonants: " + amountCons);
      System.out.println("Number of punctations: " + amountPunct);
   }

}
