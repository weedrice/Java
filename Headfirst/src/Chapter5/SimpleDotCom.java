package Chapter5;

import java.io.*;
import java.util.ArrayList;

public class SimpleDotCom {
	private ArrayList<String> locationCells;
	

	public void setLocationCells(ArrayList<String> loc) {
		// TODO Auto-generated method stub
		locationCells = loc;
	}

	public String checkYourself(String stringGuess) {
		// TODO Auto-generated method stub
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		int index = locationCells.indexOf(stringGuess);
		if(index >= 0) {
			locationCells.remove(index);
			
			if(locationCells.isEmpty()) {
				result = "kill";
			}
			else {
				result = "hit";
			}
		}
		
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
