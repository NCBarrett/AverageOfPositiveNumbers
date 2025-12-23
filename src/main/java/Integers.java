
import java.util.ArrayList;


public class Integers {

    ArrayList<Integer> positiveIntegers;
    
    public Integers() {
        positiveIntegers = new ArrayList<>();
    }
    
    public double printAvgOfInts() {
        double average = 0.0;
        double count = 0.0;
        int sum = 0;
        
        for (int i = 0; i < positiveIntegers.size(); i++) {
            sum = sum + positiveIntegers.get(i);
        }
        
        return average;
    }
}
