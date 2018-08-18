package Chapter15;

import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	String[] adviceList= {"조금씩 드세요.", "꼭 맞는 청바지를 입어보세요. 별로 뚱뚱해 보이지 않을 거에요.", "딱 한 마디만 하겠습니다: 좋지 않아요.", "오늘 하루만 솔직해집시다. 윗사람한테 용감하게 의견을 말해보세요.",
			"그 머리 스타일은 좀 안 어울리는 것 같은데요."};
	
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
