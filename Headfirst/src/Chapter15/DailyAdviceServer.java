package Chapter15;

import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	String[] adviceList= {"���ݾ� �弼��.", "�� �´� û������ �Ծ����. ���� �׶��� ������ ���� �ſ���.", "�� �� ���� �ϰڽ��ϴ�: ���� �ʾƿ�.", "���� �Ϸ縸 ���������ô�. ��������� �밨�ϰ� �ǰ��� ���غ�����.",
			"�� �Ӹ� ��Ÿ���� �� �� ��︮�� �� ��������."};
	
	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			
			while(true) {
				Socket sock = serverSock.accept();
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
						String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private String getAdvice() {
		int random = (int)(Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}

}
