import java.util.Scanner;

public class mathClass {
    public static void main(String[] args) {
        
/*  
  * Math.max() = largest of values
  * Math.min() = smallest of values
  * Math.round() = round
  * Math.ceil() = round up
  * Math.floor() = round down
  * Math.abs() = absolute value
  * Math.sqrt() = square root
*/
        double x; 
        double y;  
        double z;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+z);
        scanner.close();

    }
}

