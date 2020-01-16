
public class Time {

	private int hours;
	private int minutes; 
	private int secounds;


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
	
	// Copy Constructor
	
	Time(Time mytime)
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
	
	public void equals(int hours, int minutes, int secounds)
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

				}else if (c == 1)
				{
					minutes = Integer.parseInt(ret);
					if (minutes >= 60)
					{
						throw new IllegalArgumentException("Minutes cant be above 59");	
					}

				}else if (c == 2)
				{
					secounds = Integer.parseInt(ret);	
					if (hours >= 60)
					{
						throw new IllegalArgumentException("Secounds cant be above 59");	
					}

				}else if (c >= 3)
				{		
					throw new IllegalArgumentException("Too many Arguments found while splitting the formated string");
				}

				c++;
			}

		} catch (NumberFormatException e1)
		{
			errorMsg = e1.getMessage();

		} catch (IllegalArgumentException e2)
		{
			errorMsg = e2.getMessage();

		} finally
		{
			System.out.println("[Time.class] " + errorMsg + "\n[||->] Setting the time to 00:00:00");
			
			hours    = 0;
			minutes  = 0; 
			secounds = 0;

		}



	}
}
