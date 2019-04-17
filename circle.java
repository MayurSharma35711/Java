public class circle{
	double radius;
	String color;
	public Circle()
	{
		}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color = color; 
	}
	public double getArea()
	{
		return this.radius*this.radius*Math.PI;
	}
	public String toString()
	{
		String l = "Circle[radius=" + this.radius+ ",color="+ this.color+ "]";
		return l;	
	}
}