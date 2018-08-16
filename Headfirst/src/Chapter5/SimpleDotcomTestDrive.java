package Chapter5;

public class SimpleDotcomTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDotCom dot = new SimpleDotCom();
		int numOfGuesses = 0;
		
		int randNum = (int)(Math.random() * 5);
		
		int[] locations = {randNum, randNum+1, randNum+2};
		dot.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive == true) {
			String guess = dot.getinput("enter a number");
			String result = dot.checkYourself(guess);
			numOfGuesses++;
			
			if(result.equals("kill")) {
				isAlive = false;
				System.out.println(numOfGuesses + " guesses");
			}
		}
	}

}
