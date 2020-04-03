import java.util.Scanner;

public class Uppgift4_41 
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

            switch (sign) 
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                   amountVov++;
                   break;
                case '\u002e':
                case '\u0021':
                case '\u003f':
                case '\u002c':
                case '\u003b':
                case '\u003a':   
                case '\u002d':
                case '\u0020':
                   amountPunct++;
                   break;
           }
           if((sign >= 'a' && sign <='z')||(sign >='A'&& sign <='Z'))
           {
               amountCons++;
           } 
       }   
        System.out.println("Number of vowels: " + amountVov);
        System.out.println("Number of consonants: " + amountCons);
        System.out.println("Number of punctations: " + amountPunct);
    }
}
