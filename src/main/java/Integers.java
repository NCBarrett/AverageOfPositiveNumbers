
import java.util.ArrayList;


public class Integers {

    ArrayList<Integer> positiveIntegers;
    
    // setup the constructor
    public Integers(Integer integers) {
        this.positiveIntegers = new ArrayList<>();
    }
  
    // diagnostic function
    public int getNumber(int idx) {
        return positiveIntegers.get(idx);
    }
    
    public void add(int number) {
        this.positiveIntegers.add(number);
    }
    
    // function specific to this project
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
    
}
