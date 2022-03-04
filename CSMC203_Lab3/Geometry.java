import java.util.Scanner;
import java.lang.Math;


/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
         printMenu();

         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               value = circleArea(radius);

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value = rectangleArea(length,width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value = triangleArea(base,height);

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value = circleCircumference(radius);

               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = rectanglePerimeter(length,width);

               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = trinaglePerimeter(side1,side2,side3);

               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here
   /**
    * This method displays the menu to the users of the program. It takes no argument
    * */
   public static void printMenu(){
      System.out.println("This is a geometry calculator");
      System.out.println("Choose what you would like to calculate");
      System.out.println("1. Find the area of a circle");
      System.out.println("2. Find the area of a rectangle");
      System.out.println("3. Find the area of a triangle");
      System.out.println("4. Find the circumference of a circle");
      System.out.println("5. Find the perimeter of a rectangle");
      System.out.println("6. Find the perimeter of a triangle");
      System.out.println("Enter the number of your choice:");
   }
   
   // TASK #2 Create the value-returning methods here
   /**
    * This method takes in a single value of double type and calculates the area of the circle
    * @param radius the radius of the circle to be determined
    * @return area the area of the circle
    * */
   public static double circleArea(double radius){
      return (Math.PI * radius * radius);
   }

/**
 * This method calculates the area of the rectangle. It takes two values that MUST be provided
 * @param length the length of rectangle to be determined
 * @param width the width of the rectangle to be determined
 * @return area the area of the rectangle
 * */
   public static double rectangleArea(double length,double width){
      return (length * width);
   }

/**
 * This method calculates the area of a triangle. It takes two arguments that must be provided
 * @param height the perpendicular height of the triangle
 * @param base the base of the triangle
 * @return area the area of the triangle
 * */
   public static double triangleArea(double height,double base){
      return (0.5 * base * height);
   }
   
   /**
    * This method calculates the circumference of a circle. It takes one argument that must be
    * provided
    * @param radius the radius of the circle to be determined
    * @return circumference the circumference of the circle
    * */
   public static double circleCircumference(double radius){
      return (2 * Math.PI * radius);
   }
   
   /**
    * This method calculates the perimeter of a rectangle. It takes two mandatory arguments
    * @param length the length of the rectangle
    * @param width the width of the rectangle
    * @return perimeter perimeter of the rectangle
    * */
   public static double rectanglePerimeter(double length,double width){
      return ((2*length)+(2*width));
   }
   
   /**
    * This method calculates the perimeter a triangle. It takes 3 mandatory arguments 
    * @param a first side of the triangle
    * @param b second side of the triangle
    * @param c third side of the triangle
    * @return perimeter the perimeter of the triangle
    * */
   public static double trinaglePerimeter(double a,double b,double c){
      return (a+b+c);
   }
   
   // TASK #4 Write javadoc comments for each method
}