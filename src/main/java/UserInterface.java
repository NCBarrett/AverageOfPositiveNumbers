
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    //ArrayList<Integers> Integers = new ArrayList<>();
    private Integers integers;
    private Scanner scanner;
    
    public UserInterface(ArrayList Integers, Scanner scanner) {
        this.integers = Integers;
        this.scanner = scanner;
    }
    
    public void readInts(ArrayList Integers, Scanner scanner) {
        String input = scanner.nextLine();
        int integer = Integer.parseInt(input);
        
        while (true) {
            if (integer == 0) {
                System.out.println();
                break;
            } else {
                if (integer > 0) {
                    Integers.add(integer);
                }
            }
            
            input = scanner.nextLine();
            integer = Integer.parseInt(input);
        }
//        ;
//        System.out.println();
    }
    
}
