public class Date extends Time{
	int day;
	int month;
	int year;
	public void setDay(int day)
	{
		if(day > 31 || day < 0)
		{
			System.out.println("Error: Improper DAY");
		}
		else
			this.day = day;
	}
	public void setMonth(int month)
	{
		if(month > 12 || month < 0)
		{
			System.out.println("Error: Improper MONTH");
		}
		else
			this.month = month;
	}
	public void setYear(int year)
	{
		if(year < 0)
		{
			System.out.println("Error: Improper YEAR");
		}
		else
			this.year = year;
	}
	public void setDate(int day, int month, int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	public String toString()
	{
		String a = getMonth() + "/" + getDay() + "/" +getYear();
		return a;
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}
}