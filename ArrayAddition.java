public class ArrayAddition {

    public static void main(String[] args) {
        
        //create two vectors

        int [] a = {1,2,3,4,5};
        int [] b = {6,7,8,9,10};

        if (a.length == b.length){
            
            int [] c = new int [a.length];

            for (int  i = 0; i < a.length; i++){
                c[i] = a[i] + b[i];
                System.out.print(c[i]+" ");
            }

        }

      
    }
}