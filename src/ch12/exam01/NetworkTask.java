package ch12.exam01;

public class NetworkTask implements Runnable{

	@Override
	public void run() {	//thread가 실제 실행하는 부분
		while(true) {
			System.out.println("네트워크 통신을 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}
