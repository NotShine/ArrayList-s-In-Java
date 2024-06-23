import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxElementInArrayList {

    public static void main(String[] args) {
        
        ArrayList <Integer> Numbers = new ArrayList<>(Arrays.asList(78,45,67,12,3,99,0,234,999,34,56,72,34));

        int max = 0;

        for (int  i = 0; i< Numbers.size(); i++){
            if (Numbers.get(i) > max)
            max = Numbers.get(i);
        }

        System.out.println("The max value is: "+ max);
    }

}