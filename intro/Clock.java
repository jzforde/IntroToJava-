package intro;

public class Clock
{
	private String timeType; 
	private int hour; 
	private int minute; 
	

public Clock(String timeType, int hour, int minute)
{
	this.timeType = timeType; 
	this.hour = hour; 
	this.minute = minute; 
}


public String getTimeType()
{
	return timeType;
}


public void setTimeType(String timeType)
{
	this.timeType = timeType;
}


public int getHour()
{
	return hour;
}


public void setHour(int hour)
{
	this.hour = hour;
}


public int getMinute()
{
	return minute;
}


public void setMinute(int minute)
{
	this.minute = minute;
}

public void display()
{
	System.out.println("The time in "+ timeType + "is "+ hour + ":" + minute);
}

}