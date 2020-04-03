/**
 * 
 * Värdet på plats 1 i arrayen 'numbers' (0) ska adderas med 16. Resultatet blir då 16. 
 * Värdet på plats 0 i arrayen 'numbers' (5) ska ersättas med 10. Resultatet blir då 10.
 * Värdet på plats 2 i arrayen 'numbers' (-23) ska multipliceras med -2. Resultatet blir då 46.
 * 
 * 
 * Arrayen 'values' refererar till (pekar på) arrayen 'number'. Det är inte en kopia, utan en referens.
 * 
 */
public class Uppgift5_3
{
    public static void main(String[] args)
    {
       int[] numbers = { 5, 0, -23 };
       numbers[1] += 16;
       
       int[] values = numbers;
       values[0] = 10;
       values[2] *= -2;
       
       for (int i = 0; i < numbers.length; i++)
       System.out.println (numbers[i]);
    }
}