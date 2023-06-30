import java.util.Scanner; 

public class GuessingGame {
     
        public static void main(String[] args) 
       {
         System.out.println("----------------------------------------------------------------------------");
         System.out.println("\t\t\tNumber Guessing Game");
         System.out.println("----------------------------------------------------------------------------");
         System.out.println("You have to guess a number between 1-100");
         Scanner sc1 = new Scanner(System.in); 
         boolean playAgain= false;
         String flag;
         while(!playAgain){
            playGame();
            System.out.println("Would you like to play again? Y/N");
            flag=sc1.nextLine();
            if (flag=="Y" || flag=="y"){
               playAgain=true;
               }
            }     
        }
        
        static void playGame() {
            int computersNumber; 
            int usersGuess;      
            int guessCount;      
            computersNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println("What is your first guess?");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               usersGuess = sc.nextInt();  
               guessCount++;
               if (usersGuess == computersNumber) {
                  System.out.println("You got it in " + guessCount
                          + " guesses!  My number was " + computersNumber);
                  break;  
               }
               if (usersGuess < computersNumber)
                  System.out.println("That's too low.  Try again:");
               else if (usersGuess > computersNumber)
                  System.out.println("That's too high.  Try again:");
            }
            System.out.println();
        } 
                    
     }