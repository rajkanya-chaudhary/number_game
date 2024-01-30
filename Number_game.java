import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Number_game {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("\n Welcome to the Number Game.\n The System will generate a random number b/w 1- 100.");
        System.out.println("You have to guess that random number.\nYour score will be the number of attempts you took to guess the number.\n");
        int  round = sc.nextInt();
        System.out.println("Enter the Number of Round(between 1- 5) you want to play the Game : ");
        int rounds = sc.nextInt();
        for(int i = 1; i<= rounds;i++)
        {
            System.out.println();
            System.out.println("Round " + i + " begins.....\n");
            System.out.println("Please Enter the Difficult Level:\n1-->[There is No Limit for number of attempts]\n2--> hard[There is Limit for number of attempts]");
            int limits = sc.nextInt();
            switch (limits) {
                case 1:
                {
                    System.out.println("Opted for Easy Difficulty.\nHence,there is No Limit to number of attempt\n");
                    int randomNumber = 1+ rand.nextInt(100);
                    int count = 1;
                whileloop: while (true) {
                    System.out.println("Enter you guess number " + count + ": ");
                    int guess = sc.nextInt();
                    if(guess > randomNumber)
                    {
                        System.out.println("The number " + guess + " is HIGHER Generated Number.You have to Guess again");
                    }
                    else if(guess < randomNumber)
                    {
                     System.out.println("The  number " + guess + "is LOWER Genereted Number. You have to Guess again...");
                    }
                    else
                    {
                        System.out.println("The number " + guess + "is EQUAL to then Generated Number. \n Congrats it took you " +count+ " attemp. ");
                        break whileloop;
                    }
                    count++;
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Opted for Hard Difficulty.\nHance, there is a Limit to number of attempt you have won the game.\n Else you will lose the game.\n");
                    int randomNumber = 1+ rand.nextInt(100);
                    System.out.println("Random Number has been generated");
                    int count = 1;
                  whileloop:  while (count <= 5) 
                  {
                        System.out.println("\nNo guesses remaining : " + (6 - count) + "...\n");
                        System.out.println("Enter you guess number " +count+ " :");
                        int guess = sc.nextInt();
                        if(guess > randomNumber)
                        {
                            System.out.println("The number " + guess + "HIGHER than Generated Number. You have to Guess again...");
                        }
                        else if(guess < randomNumber)
                        {
                            System.out.println("The number " + guess + "is  LOWER than Generated Number. You have to Guess again...");
                        }
                        else
                        {
                            System.out.println("The number" + guess + "is EQUAL  to than Generated  Number.\n Congrats it took you " +count+"\nBETTER LUCK NEXT TIME\n");
                            break whileloop;
                        }
                        count++;
                    }
                    if(count > 5)
                    {
                        System.out.println("OOPS!!! Y were not able to guess the number in 5 attempt .\nThe generated Number was " + randomNumber + "\nBETTER LUCK NEXT TIME\n");
                    }
                    break;
                }
                default:
                {
                    System.out.println("--- WORNG INPUT --- \n Sorry!!! But this round has been wasted");
                    break;
                }
    
            }
            System.out.println("ROUND " + i + "is OVER.");
        }
        System.out.println("\nAll the Round are over .\nThank You for Playing the Game.\nHome You enjoyed it.");
        sc.close();

    }
}
