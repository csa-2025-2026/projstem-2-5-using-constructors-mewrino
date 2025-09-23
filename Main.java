import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    /*Circle c1 = new Circle(10.1);
    Circle c2 = new Circle(14.0);
    Circle c3 = new Circle(20.5);

    System.out.println(c1.toString());

    String output = c2.toString();
    System.out.println(output);

    System.out.printf("%s%n", c3.toString());

    System.out.println("The area of c1 is " + c1.getArea());*/

   /*double lenWid;
   double len;
   double wid;

   Rectangle r1;
   Rectangle r2;
   
   r1 = new Rectangle(323);
   r2 = new Rectangle(34, 43);
   
   System.out.println(r1.toString() + "\n" + r2.toString());*/

   double side = 7.5;
   RegularPolygon rp1 = new RegularPolygon(side);
   RegularPolygon rp2 = new RegularPolygon(4, side);
   
   System.out.println(rp1.toString() + "\n" + rp2.toString());





  }
}
