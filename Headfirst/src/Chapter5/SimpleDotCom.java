package Chapter5;

import java.io.*;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;
	

	public void setLocationCells(int[] locations) {
		// TODO Auto-generated method stub
		locationCells = locations;
	}

	public String checkYourself(String stringGuess) {
		// TODO Auto-generated method stub
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for(int cell:locationCells) {
			if(guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits == locationCells.length) {
			result = "kill";
		}
		
		System.out.println(result);
		
		return result;
	}

	public String getinput(String prompt) {
		// TODO Auto-generated method stub
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		
		return inputLine;
	}

}
