// Name - Manisha NA
//Student ID - 201906577
// Date submitted - 20 march 2020 
//Class IN2203 G1
// Name of work: Assignment1: The gambling game
package assignment1;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MainApplication {
    public static void main(String[] args) {
        Casino c = new Casino();
        c.OrganizeNewGame();
    }
}

class Casino {
    Player p1= new Player();
    Game g1 = new Game();

    String userAnswer;
    Scanner sc = new Scanner(System.in);

    public void OrganizeNewGame() {
        System.out.println("Welcome to our casino: Would you like to play a game?(y/n)");
        userAnswer = sc.nextLine();

        if (userAnswer.equals("y")) {
            System.out.println("\nLet's get started");
            g1.PlayGame();
        }
        else { 
            System.out.println("Good bye!");
        }
    }
}

class Game {
    Random rand= new Random();
    int ComputerGuess;
    Player player = new Player();

    public void PlayGame() {
        System.out.println("Guess a number from 1 to 100");
        System.out.println(" And I will guess a game");
        System.out.println(" If you guess within 10 of my guess: then you win else I win");

        ComputerGuess = ComputerGuess();

        player.Playerinfo(ComputerGuess);
    }

    public int ComputerGuess() {
        int programGuess = rand.nextInt(100);
        return programGuess;
    }
}

class Player {
    String name;
    int age;
    int UserNum;

    Scanner ab = new Scanner(System.in);
    
    public void Playerinfo(int ComputerGuess) {
        //Taking user input for name,age and number between 1 - 100;
        System.out.print("\nEnter your name : ");
        name = ab.nextLine();
        
        System.out.print("Enter your age : ");
        age = ab.nextInt();

        System.out.print("Enter number(between 1 - 100) : ");
        UserNum = ab.nextInt();

        System.out.println("\nComputer Guess is " + ComputerGuess + "\n");

        //Checking for winning condition if the difference is less than 10,so we use abs() function for always positive difference.
        if (Math.abs(UserNum - ComputerGuess) < 10)
        {
            System.out.println(name + " your guess is close, so you win the game!");
        }
        else
        {
            System.out.println(name + " your guess is not close, so you lose the game!");
        }
    }
} 