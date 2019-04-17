public class rect{
	double length;
	double width;
	public rect(){}
	public rect(double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	public float getLength()
	{
		return (float)length;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public float getWidth()
	{
		return (float)width;
	}
	public float setWidth(double width)
	{
		this.width = width;
	}
	public float area()
	{
		return length*width;
	}
	public float perimeter()
	{
		return 2*length + 2*width;
	}
	public String toString()
	{
		return "Rectangle[length = " + length + ", width = " + width;
	}
}