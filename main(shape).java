public class main extends cylinder{
	public static void main(String[] args)
{
	circle Circle = new circle();
	Circle.Circle(3.0,"red");
	System.out.println(Circle.toString());
	System.out.println(Circle.getArea());
	cylinder cyl = new cylinder();
	cyl.cyl(3.0,3.0,"blue");
	System.out.println(cyl.getVolume());
}
}