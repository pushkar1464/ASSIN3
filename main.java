//import java.util.*;
class Shape
{
	public void shape() {
		System.out.println("this is a shape");
	}
}

class polygon extends Shape
{
	
	public void poly()
	{
		System.out.println("polygon is a shape");
	}
}
class Rectangle extends polygon
{
	public void rect()
	{
		System.out.println("Rectangle is a polygon");
	}
}

class Triangle extends Rectangle
{
	public void tri()
	{
		System.out.println("Triangle is a polygon");
	}
}

class square extends Rectangle
{
	public void squ()
	{
		System.out.println("Square is a rectangle");
	}
}

public class main
{
	public static void main(String[] args)
	{
		Shape sh = new Shape();
		sh.shape();
		polygon p = new polygon();
		p.poly();
		Rectangle rt = new Rectangle();
		rt.rect();
		Triangle t = new Triangle();
		t.tri();
		square sq = new square();
		sq.squ();
	}

}