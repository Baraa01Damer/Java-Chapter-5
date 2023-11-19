package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors 
{
   public static void main (String[] args)
   {
      Scanner keyb = new Scanner(System.in);

      String PC, Human;
      char keepGoing;

      do 
      {
         PC = PCChoice();
         Human = HumanChoice();

         System.out.println("The PC's choice was " + PC);
         System.out.println("The Human's choice was " + Human);

         determineWinner(PC, Human);

         while (PC.equals(Human))
         {
            PC = PCChoice();
            Human = HumanChoice();

            System.out.println("The PC's choice was " + PC);
            System.out.println("The Human's choice was " + Human);

            determineWinner(PC, Human);
         }


         System.out.println("\n" + "Play again? (y/n)");
         keepGoing = keyb.nextLine().toLowerCase().charAt(0);

         while ( keepGoing != 'y' && keepGoing != 'n' )
         {
            System.out.println("Invalid input, please enter (y/n)");
            keepGoing = keyb.nextLine().toLowerCase().charAt(0);
         }

      } while (keepGoing == 'y');

   }
   public static String PCChoice()
   {
      String[] choice = {"rock","paper","scissors"};
      Random rand = new Random();
      int PCChoice = rand.nextInt(3);
      return choice[PCChoice];
   }
   public static String HumanChoice()
   {
      Scanner keyb = new Scanner(System.in);
      System.out.print("Enter rock, paper, or scissors: ");
      String choice = keyb.nextLine();

      isValidChoice(choice);
      return choice;
   }
   public static boolean isValidChoice (String choice)
   {
      Scanner keyb = new Scanner(System.in);

      while (!(choice.equalsIgnoreCase("rock")) && !(choice.equalsIgnoreCase("paper")) && !(choice.equalsIgnoreCase("scissors")))
    {
       System.out.print("Invalid input, enter rock, paper, or scissors: ");
       choice = keyb.nextLine();
    }

       return true;
    }
    public static void determineWinner(String PC, String Human)
    {
       if (PC.equalsIgnoreCase("rock") && Human.equalsIgnoreCase("paper"))
          System.out.println("\n" + "Paper wraps rock.\nThe Human wins!");
       else if (PC.equalsIgnoreCase("rock") && Human.equalsIgnoreCase("scissors"))
          System.out.println("\n" + "Rock smashes scissors.\nThe PC wins!");
       else if (PC.equalsIgnoreCase("paper") && Human.equalsIgnoreCase("rock"))
          System.out.println("\n" + "Paper wraps rock.\nThe PC wins!");
       else if (PC.equalsIgnoreCase("paper") && Human.equalsIgnoreCase("scissors"))
          System.out.println("\n" + "Scissors cuts paper.\nThe Human wins!");
       else if (PC.equalsIgnoreCase("scissors") && Human.equalsIgnoreCase("rock"))
          System.out.println("\n" + "Rock smashes scissors.\nThe Human wins!");
       else if (PC.equalsIgnoreCase("scissors") && Human.equalsIgnoreCase("paper"))
          System.out.println("\n" + "Scissors cuts paper.\nThe PC wins!");
       else if (PC.equalsIgnoreCase(Human))
          System.out.println("\n" + "The game is tied!\nGet ready to play again...");
    }   
}