package EX02;

public class TV {
	private String model;
	private int inch;
	private boolean power;
	private int channel;
	private int volume;


	void power() {
		power = !power;
	if(power)	
		System.out.println("Tv를 켬");
	else
		System.out.println("Tv를 끔");
	}
	void setChannel(int channel) {
		this.channel = channel;
	}
public int getChannel() {
	return channel;
}
public void setVolume(int volume) {
	this.volume = volume;
}
public int getVolume() {
	return volume;
}
}



