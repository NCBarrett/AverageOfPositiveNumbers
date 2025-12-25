
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    //ArrayList<Integers> integers = new ArrayList<>();
    private Integers integers;
    private Scanner scanner;
    
    public UserInterface(Integers integers, Scanner scanner) {
        this.integers = integers;
        this.scanner = scanner;
    }
    
    public void readInts() {
        String input = this.scanner.nextLine();
        int integer = Integer.parseInt(input);
        
        while (true) {
            if (integer == 0) {
                System.out.println();
                break;
            } else {
                if (integer > 0) {
                    this.integers.add(integer);
                }
            }
            
            input = scanner.nextLine();
            integer = Integer.parseInt(input);
        }

        System.out.println(integers);
    }
}