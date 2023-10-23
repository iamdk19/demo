class Rectangle
{
	double length;
	double breadth;
	
	void EnterValue(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void findArea()
	{
		double area=length*breadth;
		System.out.println("Area of rectangle="+area);
	}
}
class AreaRectangle
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.EnterValue(5.2,9);
		r.findArea();																	
	}
}