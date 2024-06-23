import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> Values = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> Temp = new ArrayList<>();

        for (int i = Values.size() - 1; !(i < 0); i--){
            Temp.add(Values.get(i));
        }

        System.out.println(Temp);
    }
    
}
