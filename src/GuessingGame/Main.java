package GuessingGame;

public class Main {
	
		public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		System.out.println("I'm thinking about the number between 1 and 20 ?");
		ui.play(game);
	}

}
