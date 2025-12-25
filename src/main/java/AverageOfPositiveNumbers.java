
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList<Integers> ints = new ArrayList<>();
        //Integers ints = ArrayList<>();
        //Integers(integer) ints;
        Integers ints = 0;
        UserInterface ui = new UserInterface(ints, scanner);
        
        ui.readInts();
    }
}
