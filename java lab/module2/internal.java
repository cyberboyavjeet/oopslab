import java.util.*;

public class internal {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);   
        int Smallest = Integer.parseInt(args[1]); 
        int Largest = Integer.parseInt(args[2]); 

        int arr[] = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(args[i + 3]);
        }

        
        Arrays.sort(arr);

        
        int ASmallest = arr[Smallest - 1];

        
        int ALargest = arr[n - Largest];

        System.out.println("Kth Smallest: " + ASmallest);
        System.out.println("Kth Largest: " + ALargest);
    }
}