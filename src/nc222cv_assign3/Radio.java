package nc222cv_assign3;

public class Radio {
	private boolean on;
	private int volume;
	private int channel;
	
	private int minVolume = 0;
	private int maxVolume = 5;
	
	private int minChannel = 1;
	private int maxChannel = 10;
	
	public Radio() {
		defendSetting();
	}
	
	private void defendSetting() {
		volume = 1;
		channel = 1;
	}

	public String getSettings() {
		return String.format("Settings: On %b, Channel %d, Volume %d", on, channel, volume);
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
		defendSetting();
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int newVolume) {
		if(!on) {
			System.out.println("Radio off ==> No adjustment possible");
			return;
		}
		
		if(newVolume < minVolume) {
			System.out.println("New volume not within range!");
			return;
		}
		else if(newVolume > maxVolume) {
			volume = maxVolume;
			System.out.println("New volume not within range!");
			return;
		}
		
		volume = newVolume;
	}
	
	public void volumeUp() {
		if(!on) {
			System.out.println("Radio off ==> No adjustment possible");
			return;
		}
		
		volume++;
		
		if(volume > maxVolume) {
			volume = maxVolume;
			System.out.println("New volume not within range!r");
		}
	}
	
	public void volumeDown() {
		if(!on) {
			System.out.println("Radio off ==> No adjustment possible");
			return;
		}

		
		volume--;
		
		if(volume < minVolume) {
			volume = minVolume;
			System.out.println("New volume not within range!");
		}
	}
	
	public void channelUp() {
		if(!on) {
			System.out.println("Radio off ==> No adjustment possible");
			return;
		}
		
		channel++;
		
		if(volume > maxChannel) {
			volume = maxChannel;
			System.out.println("New channel not within range!");
		}
	}
	
	public void channelDown() {
		if(!on) {
			System.out.println("Radio off ==> No adjustment possible");
			return;
		}
		
		channel--;
		
		if(channel < minChannel) {
			channel = minChannel;
			System.out.println("New channel not within range!");
		}
	}
	
	public void setChannel(int newChannel) {
		if(!on) {
			System.out.println("Radio off ==> No adjustment possible");
			return;
		}
		
		if(newChannel < minChannel) {
			System.out.println("New channel not within range!");
			return;
		}
		else if(newChannel > maxChannel) {
			System.out.println("New channel not within range!");
			return;
		}
		
		channel = newChannel;
	}
}
