package prob4;

public class TV {
	private boolean power;
	private int channel;	//0~50
	private int volume;		//0~50



	public TV(int channel, int volume, boolean power) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}

	public void power(boolean on) {
		power = on;
	}

	public void channel(int channel) {
		if(!power) {

		}
		if(channel >50) {
			channel = 0;
		}
		if(channel <0) {
			channel =50;
		}
		this.channel =channel;
	}

	public void channel(boolean up) {

		if(up) {
			this.channel++;			
		}else {
			this.channel--;
		}
		channel(channel);
	}

	public void volume(int volume) {
		if(volume>50) {
			volume=0;
		}
		if(volume<0) {
			volume=50;
		}
		this.volume = volume;
	}

	public void volume(boolean up) {

		if(up) {
			volume++;			
		}else {
			volume--;
		}
		volume(volume);
	}

	public void status() {
		System.out.println("TV[power="+power+
				", channel="+channel+
				", volume="+volume+"]");
	}

}
