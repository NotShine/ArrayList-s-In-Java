import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrayList {

    public static void main (String [] args ){

    ArrayList<Integer> OddNumbers = new ArrayList<>(Arrays.asList(1,3,5,7,9));

    ArrayList<Integer> EvenNumbers = new ArrayList<>(Arrays.asList(2,4,6,8,10));

    //How to merge?
    OddNumbers.addAll(EvenNumbers);

    System.out.println(OddNumbers);
 }
}

