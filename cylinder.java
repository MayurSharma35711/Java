public class cylinder extends circle{
	double radius;
	double height;
	String color;
	public cylinder(){}
	public cylinder(double radius)
	{
		this.radius = radius;
	}
	public cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	public cylinder(double radius, double height, String color)
	{
		this.radius = radius;
		this.height = height;
		this.color = color;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getVolume()
	{
		return Math.PI*this.radius*this.radius*this.height;
	}

}