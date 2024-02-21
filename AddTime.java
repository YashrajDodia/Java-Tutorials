import java.util.Scanner;

class Time{
	int hour;
	int minute;
	int seconds;
	int diff;
	public Time(int hour, int minute, int seconds){
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	public void addTime(Time t1, Time t2){
		this.seconds = t1.seconds + t2.seconds;
		if(this.seconds>60){
            int diff = this.seconds-60;
            minute=minute+1;
            this.seconds=diff;
		}
		this.minute = t1.minute + t2.minute;
		if(this.minute>60){
			int diff = this.minute-60;
            this.hour++;
            this.minute=diff;
		}		
		this.hour = t1.hour + t2.hour;
		System.out.println(hour+","+minute+","+seconds);
	}
}
public class AddTime{
	public static void main(String[] args) {
		Time t1 = new Time(2,3,61);
		Time t2 = new Time(5,6,0);
		Time t3 = new Time(0,0,0);
		t3.addTime(t1,t2);
	}
}