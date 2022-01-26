abstract class Shape
{
    abstract void numberOfSides();
}

class Rectangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("Number of sides of Rectangle is 4");
    }
}

class Triangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("Number of sides of Triangle is 3");
    }
}

class Hexagon extends Shape
{
    void numberOfSides()
    {
        System.out.println("Number of sides of Hexagon is 6");
    }
}

class shapes
{
   public static void main(String args[])
    {
        Rectangle rec = new Rectangle();
        rec.numberOfSides();
        Triangle tri = new Triangle();
        tri.numberOfSides();
        Hexagon hex = new Hexagon();
        hex.numberOfSides();
    }
 }
