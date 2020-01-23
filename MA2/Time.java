public class Time {

	private int hours;
	private int minutes; 
	private int secounds;

	//suggestion: perhaps add a private method that class uses to check it validity of it's data members
	// instead of copy pasting the code
	
	// Constructor
	public Time(int hours, int minutes, int secounds)
	{
	
		// Check if given time is valid
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
	
	// string Constructor
	
	public Time(String time){
		formatString(time);}
	
	// Copy Constructor
	
	Time(Time mytime) // public by default?
	{
		hours    = mytime.hours;
		minutes  = mytime.minutes;
		secounds = mytime.secounds;
	}


	// toString methode
	// format -> HH:MM:SS

	public String toString() 
	{
		String time_str;
		if (hours < 10) // Check if leading 0 is needed
		{
			time_str = "0" + hours + ":";
		} else
		{
			time_str = hours + ":";
		}
		
		if (minutes < 10) // Check if leading 0 is needed
		{
			time_str = time_str + "0" + minutes + ":";
		} else
		{
			time_str = time_str + minutes + ":";
		}

		if (secounds < 10) // Check if leading 0 is needed
		{
			time_str = time_str + "0" + secounds;
		} else
		{
			time_str = time_str + secounds;
		}

		return time_str;

	}

	// equals methode
	// C Constructor
	
	public boolean equals(int hours, int minutes, int secounds){
		return (hours == this.hours) && (minutes == this.minutes) && (secounds == this.secounds);}

	// formatString methode
	// This takes a string in the format -> HH:MM:SS
	// or H:M:S and any mix of those two

	public void formatString(String format_str)
	{
		String errorMsg = null;
		int c = 0;
		try 
		{
			for (String ret: format_str.split(":"))
			{
				if (c == 0)
				{
					hours = Integer.parseInt(ret);
					if (hours >= 24)
					{
						throw new IllegalArgumentException("Hours cant be above 23");	
					}
				}
				
				else if (c == 1)
				{
					minutes = Integer.parseInt(ret);
					if (minutes >= 60)
					{
						throw new IllegalArgumentException("Minutes cant be above 59");	
					}
				}
				else if (c == 2)
				{
					secounds = Integer.parseInt(ret);
					if (secounds >= 60)
					{
						throw new IllegalArgumentException("Secounds cant be above 59");	
					}
				}
				c++;
			}

		} 
		catch (IllegalArgumentException e)
		{
			hours = 0;
			minutes = 0;
			secounds = 0;
			errorMsg = e.getMessage();
		} 
	}
	
}
