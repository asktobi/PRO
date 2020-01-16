
public class Time {

	private int hours;
	private int minutes; 
	private int secounds;

	public void Time(int hours, int minutes, int secounds)
	{
	
		if (hours >= 24 || minutes >= 60 || secounds >= 60)
		{
			this.hours    = 0;
			this.minutes  =	0; 
			this.secounds = 0;
		}

		this.hours    = hours;
		this.minutes  = minutes;
		this.secounds = secounds;
	}

	public String toString() 
	{
		String time_str;
		if (hours < 10)
		{
			time_str = "0" + hours + ":";
		} else
		{
			time_str = hours + ":";
		}
		
		if (minutes < 10)
		{
			time_str = time_str + "0" + minutes + ":";
		} else
		{
			time_str = time_str + minutes + ":";
		}

		if (secounds < 10)
		{
			time_str = time_str + "0" + secounds;
		} else
		{
			time_str = time_str + secounds;
		}

		return time_str;

	}


}
