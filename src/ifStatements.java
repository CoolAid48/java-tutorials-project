public class ifStatements {
       public static void main(String[] args) {
     
        // if statement = performs a block of code if its condition evaluates to be true

        // "==" vs assignment operator "=":
        // "=" means assigning a variable // "==" means equals
        
        // Comparison Operators:
        // >= means greater or equal to // <= means less or equal to

        int age = 18;

        if(age>=75) {
            System.out.println("Okay boomer!");
        } 
        
        else if(age>=18) {
            System.out.println("You are an adult");
        }

        else if(age>=13) {
            System.out.println("You are a teenager!");
        } 

        else {
            System.out.println("You are not an adult");
        }
    }
}
