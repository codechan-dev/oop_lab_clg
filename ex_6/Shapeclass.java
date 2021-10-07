import java.util.*;
abstract class shape
{
 int a,b;
 abstract public void printarea();
}
class rectangle extends shape
{
public int area_rect;
public void printarea()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the length and breadth of rectangle");
 a=s.nextInt();
 b=s.nextInt();
 area_rect=a*b;
 System.out.println("Length of rectangle: "+a +"breadth of rectangle: "+b);
 System.out.println("The area of rectangle is:"+area_rect);
 }
 }
class triangle extends shape
{
double area_tri;
public void printarea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the base and height of triangle:");
a=s.nextInt();
b=s.nextInt();
System.out.println("Base of triangle: "+a +"height of triangle: "+b);
area_tri=(0.5*a*b);
System.out.println("The area of triangle is:"+area_tri);
}
} 

class circle extends shape
{
double area_circle;
public void printarea()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of circle:");
a=s.nextInt();
area_circle=(3.14*a*a);
System.out.println("Radius of circle:"+a);
System.out.println("The area of circle is:"+area_circle);
 }
}
public class Shapeclass
{
 public static void main(String[] args)
{
rectangle r=new rectangle();
r.printarea();
triangle t=new triangle();
t.printarea();
circle r1=new circle();
r1.printarea();
}
}