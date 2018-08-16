package Chapter6;

import java.util.ArrayList;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	void setUpGame() {
		DotCom dot1 = new DotCom();
		dot1.setName("Pets.com");
		DotCom dot2 = new DotCom();
		dot2.setName("eToys.com");
		DotCom dot3 = new DotCom();
		dot3.setName("Go2.com");
		dotComsList.add(dot1);
		dotComsList.add(dot2);
		dotComsList.add(dot3);
		
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		for(DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	void startPlaying() {
		while(dotComsList.isEmpty() == false) {
			String userInput = helper.getUserInput("Enter a guess");
			checkUserGuess(userInput);
		}
		finishGame();
	}
	
	void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		for(DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("hit")) {
				break;
			} 
			if(result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	void finishGame() {
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if(numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough." + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}
	
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
