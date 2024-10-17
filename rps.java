import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> wordList = new ArrayList<>();
    Random rand = new Random();

    String cpuChoice = "rock";

        // greeting the user
        System.out.println("Hello, Welcome to RPS");


        // ask user input for game
        System.out.println("Choose a weapon...");
        System.out.println("rock, paper, scissors");
        
        String input = scanner.nextLine().toLowerCase(); //in.nextLine().toLowerCase();
        System.out.println("You chose " + input);
        
        

        // storing the options in an array

        wordList.add("rock");
        wordList.add("paper");
        wordList.add("scissors");

        // random number generator from array
        int ran = rand.nextInt(3);
        cpuChoice = wordList.get(ran);

        // if user input
            if(input.equals("rock") && cpuChoice.equals("scissors")){

                System.out.println("You win!");
                System.out.println("Cpu chose " + cpuChoice);
                
            }
            else if(input.equals("scissors") && cpuChoice.equals("paper")){

                System.out.println("You win!");
                System.out.println("Cpu chose " + cpuChoice);
                
            }
            else if(input.equals("paper") && cpuChoice.equals("rock")){

                System.out.println("You win!");
                System.out.println("Cpu chose " + cpuChoice);
                
            }
            else if(input.equals(cpuChoice)){

                System.out.println("Tie!");
                System.out.println("Cpu chose " + cpuChoice);
            }
            else {
 
                System.out.println("You lose!");
                System.out.println("Cpu chose " + cpuChoice);
            }
            


        // cpu picks at random

        // displays the winner
        




    }
}
