package j0122;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	Time(){}
	
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	void setHour(int hour) {
		this.hour = hour;
	}
	int getHour() {
		return hour;
	}
	
	void setMinute(int minute) {
		this.minute = minute;
	}
	int getMinute() {
		return minute;
	}
	
	void setSecont(int second) {
		this.second = second;
	}
	int getSecond() {
		return second;
	}
	
	
	
}
