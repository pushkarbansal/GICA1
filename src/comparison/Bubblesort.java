package comparison;

import java.util.concurrent.TimeUnit;

public class Bubblesort {
    public Bubblesort(int b[])
     {
            // Scanner sc = new Scanner(System.in);
            long beforeUsedMem;
            // long startMemory = Runtime.getRuntime();
            long startTime = System.nanoTime();
            int arr1[] = bubbleSort(b);
            long endTime = System.nanoTime();
            // long endMemory = Runtime.getRuntime()
            System.out.println("Sorted array");
            printArray(arr1);
            long timeElapsed = endTime - startTime;
            
            new Model(timeElapsed/1000000);
    
        
    }
    int[] bubbleSort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    return arr;
        }
     
        /* Prints the array */
        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
}
