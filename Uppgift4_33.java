public class Uppgift4_33
{
    public static void main(String[] args)
    {
       double number = 2.0;
       while (number > 0.5)
       {
           if (number == 0.5)
               break;
           number -= 0.1;
           System.out.println (number);
       }
       System.out.println ("Finished.");
   }
}

