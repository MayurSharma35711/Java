public class Employee{
	public float salary;
	public String fname;
	public String lname;
	public int id; 
	public int getID()
	{
		return this.id;
	}
	public String getFirstName()
	{
		return this.fname;
	}
	public String getLastName()
	{
		return this.lname;
	}
	public String getName()
	{
		return getFirstName() +" "+ getLastName();
	}
	public float getSalary()
	{
		return this.salary;
	}
	public float setSalary(float newSalary)
	{
		this.salary = newSalary;
		System.out.println(this.salary);
		return newSalary;
	}
	public float getAnnualSalary()
	{
		return this.salary*12;
	}
	public float raise(int percentRaise)
	{
		float newPercent = percentRaise/100.f;
		System.out.println(newPercent);
		newPercent++;
		System.out.println(newPercent);
		float a = setSalary(this.salary*newPercent);
		return a;
	}
	public String toString()
	{
		String a = "Employee[id= " + getID()+", name=" +getName()+", salary="+getSalary()+"]";
		return a;
	}
}