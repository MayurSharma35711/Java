public class Time{
int hour;
int minute;
int second;
	public int getHour()
	{
		return this.hour;
	}
	public int getMin()
	{
		return this.minute;
	}
	public int getSecond()
	{
		return this.second;
	}	
	public void setSecond(int s)
	{
		this.second = s;
	}
	public void setMinute(int s)
	{
		this.minute = s;
	}
	public void setHour(int s)
	{
		this.hour = s;
	}
	public void setTime(int s, int m, int t)
	{
		setSecond(s);
		setMinute(m);
		setHour(t);
	}
	public String toString()
	{
		return this.hour + ":" + this.minute + ":" + this.second;
	}
	public int increment(int n)
	{
		this.second +=n;
		return this.second;
	}
}