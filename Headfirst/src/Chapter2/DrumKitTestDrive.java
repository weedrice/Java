package Chapter2;

class DrumKit {
	boolean snare = true;
	boolean topHat = true;
	
	void playSnare() {
		System.out.println("bang bang ba-bang");
	}
	
	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}

public class DrumKitTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrumKit d= new DrumKit();
		if(d.snare == true) {
			d.playSnare();
		}
		d.snare = false;
		d.playTopHat();
	}

}
