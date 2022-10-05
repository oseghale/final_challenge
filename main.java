import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    Boolean retry = true;
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    while (retry) {
      try {
        System.out.println("Hello! Do you want to create a Triangle (type T), Circle (type C), or Square (type S)?");
        String input = scan.nextLine().toLowerCase(); 
    
        switch(input) {
          case "t": System.out.println("Great! please provide the base and height of your triangle...");
              int base = scan.nextInt(); 
              int height = scan.nextInt();
              scan.nextLine();
    
              Triangle triangle;
    
              if (base == height) {
                  triangle = new Triangle(base); 
              } else {
                  triangle = new Triangle(base, height);
              }
            
              System.out.println("You created a triangle with base: " + triangle.getBase() + "and height: " + triangle.getHeight());
    
              System.out.println("The area of your triangle is: "  + triangle.calculateArea()  
     );
              shapes.add(triangle);        
              break;
          case "c": System.out.println("Here is your wings!");
              break;
          case "s": System.out.println("Here is your salad!");
              break;
          default: System.out.println("Invalid input");
              break;
        }
    
        System.out.println("Do want to continue creating shapes? (y or n)");
        String retryInput = scan.nextLine().toLowerCase();
        switch (retryInput) {    
          case "y": retry = true;
            break;
          case "n": retry = false;
            break;
        }
      } catch (Exception e) {
        System.out.println("Invalid input! Try again!");
      }
    }
    System.out.println("Here is a list of shapes you created");
    
    
  }
}
