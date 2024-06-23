import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        //this is an ARRAY - fixed size
        //primitive data type and objects
       // String [] suitsArray = new String[4];
        String [] suitsArray2 = {"Mike", "Harvey", "Donna", "Jessica"};

       //this is an ARRAYLIST 
       //can hold objects only. That is, you cant make a list for int. However, just use the associated Wrapper class. Example, Integer, Long, 

      // ArrayList<String> suitsArrayList = new ArrayList<>();
        ArrayList<String> suitsArrayList2 = new ArrayList<>(Arrays.asList("Mike", "Harvey", "Donna", "Jessica"));

        //you can also have (Arrays.asList("Mike", "Harvey", "Donna", "Jessica")); as well. However, this give an immutable list.

        //get value from array - specify index.

        System.out.println(suitsArray2[1]);

        //get value from ArrayLst
        System.out.println(suitsArrayList2.get(1));

        System.out.println(suitsArray2.length); //length is a field
        System.out.println(suitsArrayList2.size()); //size is a method 

        //add element to array
         // can't randomly add elements to an array since it has a fixed size.

         // add element to ArrayList
         suitsArrayList2.add("Louis");

         //change an element in array.
         suitsArray2[1] = "Rachel";

         //change element in arrayList
         suitsArrayList2.set(1, "Rachel");

         //remove an element from array.
         //cant just remove an element from an array

         //remove element from arrayList
         suitsArrayList2.remove(1);
         suitsArrayList2.remove("Rachel");

         //print
         System.out.println(Arrays.toString(suitsArray2));
         System.out.println(suitsArrayList2);
         System.out.println(suitsArray2); //this prints the memory address of the array.
        
    }
}
