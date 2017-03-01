package GuessingGame;

import java.util.Scanner;

public class GameConsole {
	Scanner input = new Scanner(System.in);
	/**
	 * 
	 * @param game call object GuessingGame
	 * @return the number that your guess equal the secret
	 */
	public int play(GuessingGame game){	
		System.out.println("Guessing Game");
		int number = 0;
		do{
			System.out.print("Your Guess? : ");
			number = Integer.parseInt(input.nextLine());
			game.guess(number);
			System.out.println(game.getHint());
			game.setCount();
		}while(game.guess(number)==true);
		System.out.printf("You used %d guesses.",game.getCount());
		return number;
		
	}

}
