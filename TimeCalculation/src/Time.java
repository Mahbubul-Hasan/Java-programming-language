
public class Time 
{
	public void timeCount(int hours,int minutes, int secounds)
	{
		hours = ((hours>=0 && hours<= 24) ? hours : 0);
		minutes = ((minutes>=0 && minutes<=60) ? minutes : 0);
		secounds = ((secounds>=0 && secounds<=60) ? secounds : 0);
		System.out.println(hours+":"+minutes+":"+secounds);
	}
}
