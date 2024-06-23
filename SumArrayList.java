import java.util.Scanner;
import java.util.ArrayList;

public class SumArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner object

ArrayList<Integer> NumbersToSum = new ArrayList<>(); //create arrayList

System.out.println("Enter number or x to find sum: ");

String input = ""; //store all user input

while (true){
    input = scanner.next(); //take input into scanner

if (input.equals("x")){ //checks for input == x only
    break;
}
try{
    int number = Integer.parseInt(input); //convert string input to integer
    NumbersToSum.add(number); //add numbers to arrayList
}
catch(NumberFormatException e){ //exception thrown when attempt is made to convert string into numeric type BUT string does not have an appropriate format.
    System.out.println("Invalid input. Please enter a number or x to find sum: ");
}

}

int sum = 0;
for (int number : NumbersToSum) { //loop to sum the values in the arrayList.
    sum += number;
}


scanner.close();
System.out.println(sum);

}

    }

    
