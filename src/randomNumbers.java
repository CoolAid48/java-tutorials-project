import java.util.Random;

public class randomNumbers {

    public static void main(String[] args) {
        
        Random random = new Random();

        int x = random.nextInt(6)+1;    // between 0 and 6 (that +1 makes it between 1 and 6)
        // double y = random.nextDouble();       betweenn 0 and 1
        //boolean z = random.nextBoolean();      between "true" and "false"

        System.out.println(x);



    }
}