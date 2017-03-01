package GuessingGame;

import java.util.Random;
/**
 * Game of guessing a secret number.
 * @author Dacharat Pankong
 */

public class GuessingGame {
	/* properties of a guessing game */
	private int upperbond;
	private int secret;
	private String hint;
	public int count = 0;
	
	/**
	 * Initialize a new game.
	 * @param upperbond is the max value for the secret number (>1).
	 */
	public GuessingGame( int upperbond ){ // this is a constructor
		this.upperbond = upperbond;
		this.secret = getRandomNumber(upperbond);
		setHint(String.format("I'am thinking number between 1 and %d.",upperbond));
	}
	
	/**
	 * Create a random number between 1 and limit.
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber( int limit){
		long seed = System.currentTimeMillis();
		Random rand = new Random( seed );
		return rand.nextInt(limit) + 1;
	}
	
	/**
	 * 
	 * @param number is the number that you input
	 * @return if number that you input is not equal the secret it will hint you that the secret is large or small than you input 
	 */
	public boolean guess(int number){
		if(number == secret){
			setHint(String.format("Correct. The secret is %d", secret));
			return false;
		}
		else {
			if(number > secret){
				setHint(String.format("Sorry, your guess is too large"));
				return true;
			}
			else {
				setHint(String.format("Sorry, your guess is too small"));
				return true;
			}
		}
	}
	
	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess
	 */
	public String getHint(){
		return this.hint;
	}
	/**
	 * 
	 * @param hint is the text that you want to change
	 */
	public void setHint(String hint){
		this.hint = hint;
	}
	
	/**
	 * 
	 * @return how many time that you guess
	 */
	public int getCount(){
		return count;
	}
	
	/**
	 * add time that you guess
	 */
	public void setCount(){
		count = this.count + 1; 
	}
}
