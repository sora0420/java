package ch08.exam04;

public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		//타이어 장착
		myCar.t1 = new KumhoTire();
		myCar.t2 = new KumhoTire();
		myCar.t3 = new HanKookTire();
		myCar.t4 = new HanKookTire();
		
		//달려보자
		myCar.run();
		
	}
}
