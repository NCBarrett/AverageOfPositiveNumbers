
import java.util.ArrayList;


public class Integers {

    ArrayList<Integer> positiveIntegers;
    
<<<<<<< HEAD
    public Integers(Integers integers) {
        this.positiveIntegers = new ArrayList<>();
    }
    
//    public double printAvgOfInts() {
//        double average = 0.0;
//        double count = 0.0;
//        int sum = 0;
//        
//        for (int i = 0; i < positiveIntegers.size(); i++) {
//            sum = sum + positiveIntegers.get(i);
//        }
//        
//        count = positiveIntegers.size();
//        average = sum / count;
//        
//        return average;
//    }
=======
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
>>>>>>> fa78dbba143772fde1bf4f21237e40fc0b09eda7
}
