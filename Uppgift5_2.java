import java.util.Scanner;

public class Uppgift5_2
{
   public static void main (String[] args)
   {
      String text;
      int lengthTxt = 0;
      
      Scanner userInput = new Scanner (System.in);
      System.out.print("Skriv en text: " + "\n");
      text = userInput.nextLine();
      
      lengthTxt = text.length();
      char [] charArray;
      charArray = new char[lengthTxt];
      
      for (int i = 0; i <= text.length() - 1 ; i++)
      {
          charArray[i] = text.charAt(i);
      }
      
      System.out.print(text);
      
      for (int i = text.length() - 1; i >= 0; i--)
      {
         System.out.print(charArray[i]);
      }
      
   }
}