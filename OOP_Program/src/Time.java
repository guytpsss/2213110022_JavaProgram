
public class Time {
	private int second;
	private int minute;
	private int hour;
	//Default constructor
	public Time() {
		this.second =0;
		this.minute=0;
		this.hour=0;
	}
	//Constructor with parameter
	public Time(int second,int minute,int hour) {
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	//Getter and Setter methods
	public int getHour() {
		return minute;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void setHour(int hour) {
		this.hour=hour;
	}
	public void setMinute(int minute) {
		this.minute=minute;
	}
	public void setSecond(int second) {
		this.second=second;
	}
	//return string in the form of hh:mm:ss
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public void setTime(int second,int minute,int hour) {
		this.second = second;
		this.minute=minute;
		this.hour=hour;
	}
	//Advance this Time instance by one second
	public Time nextSecond() {
		++second;
		if(second>=60) {
			second = 0;
			++minute;
			if(minute>=60) {
				minute = 0;
				++hour;
				if(hour>=24) {
					hour=0;
				}//end hour
			}//end minute
		}//end second
		//return "this" instance,to support chaining operations
		//e.g,t1.nextSecon().nextSecond()
		return this;
	}
}
