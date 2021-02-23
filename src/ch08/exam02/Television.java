package ch08.exam02;

public class Television implements RemoteControl {
	private int volume;
	//메소드(객체 사용 설명)
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff(){
		System.out.println("TV를 끕니다.");
			
	}
	public void setVolume(int volume){
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		System.out.println("TV 볼륨을 "+volume+"로 조정합니다.");
		
	}
}
