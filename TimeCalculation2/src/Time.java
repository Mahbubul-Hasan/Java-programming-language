
public class Time 
{
	public void timeCount(int hours, int minutes, int secouds)
	{
		if (hours>=0 && hours<=24)
		{
			//String am = "AM";
			//String pm = "PM";
			String houresString = ((hours<12)? "AM" : "PM");
			if (hours > 12)
			{
				hours = hours % 12;
			}
			
			System.out.println(hours+":"+minutes+":"+secouds+" "+houresString);
		}
	}
}