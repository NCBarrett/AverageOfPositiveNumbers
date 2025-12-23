
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integers> ints = new ArrayList<>();
        UserInterface ui = new UserInterface(ints, scanner);
        
        ui.readInts(ints, scanner);
    }
}
