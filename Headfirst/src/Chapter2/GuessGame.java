package Chapter2;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int)(Math.random() * 10);
		System.out.println("0 �̻� 9 ������ ���ڸ� ���纸����.");
		
		while(true) {
			System.out.println("����� �� ���ڴ� " + targetNumber + "�Դϴ�.");
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("1�� ������ ���� ����: " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("2�� ������ ���� ����: " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("3�� ������ ���� ����: " + guessp3);
			
			if(guessp1 == targetNumber) {
				p1isRight = true;
			}
			
			if(guessp2 == targetNumber) {
				p2isRight = true;
			}
			
			if(guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("���� ������ �ֽ��ϴ�.");
				System.out.println("1�� ����: "+p1isRight);
				System.out.println("2�� ����: "+p2isRight);
				System.out.println("3�� ����: "+p3isRight);
				System.out.println("���� ��.");
				break;
				
			} else {
				System.out.println("�ٽ� �õ��ؾ� �մϴ�.");
			}
		}
	}
}
