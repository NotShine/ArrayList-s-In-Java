import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesArrayList {

    public static void main(String[] args) {

        //REMOVING DUPLICATE STRINGS.
        // ArrayList<String> list = new ArrayList<>(Arrays.asList("Apples", "Bananas", "Apples", "Mangeo", "Mangeo"));

        // ArrayList<String> TempList = new ArrayList<>();


        // for (int i = 0; i < list.size(); i++){
        //     if(!TempList.contains(list.get(i))){
        //         TempList.add(list.get(i));
        //     }
        // }

        // System.out.println(TempList);

        ArrayList<Integer> Numbers = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,5,6,5,7,10,3,4,6));

        ArrayList<Integer>TempList = new ArrayList<>();

        for (int i = 0; i < Numbers.size(); i++){
            if (!TempList.contains(Numbers.get(i))){
                TempList.add(Numbers.get(i));
            }
        }
                System.out.println(TempList);

       //can also use HashSet.


         ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);

        System.out.println("Original list: " + list);

        // Create a new list to store unique elements
        ArrayList<Integer> uniqueList = new ArrayList<>(); //create new list to store unique elements and a `HashSet` (seen) to track elements already added.
        // Use a HashSet to keep track of elements already added
        HashSet<Integer> seen = new HashSet<>();

        for (int i : list) {
            // Add only elements that are not in the seen set
            if (seen.add(i)) {
                uniqueList.add(i);
            }
        }

        System.out.println("List after removing duplicates: " + uniqueList);

    }
}
