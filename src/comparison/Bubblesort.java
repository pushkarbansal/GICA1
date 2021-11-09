package comparison;



public class Bubblesort {
    long timeElapsed;
    int[] arr1;
    public Bubblesort(int b[])
     {
            // Scanner sc = new Scanner(System.in);
            // long beforeUsedMem;
            // long startMemory = Runtime.getRuntime();
            long startTime = System.nanoTime();
            arr1 = bubbleSort(b);
            long endTime = System.nanoTime();
            // long endMemory = Runtime.getRuntime()
           
            //printArray(arr1);
            timeElapsed = endTime - startTime;
            
            // Model Bubblemodel = new Model(timeElapsed/1000000);
            // Bubbleval();
        
    }
    float val(){
    	return (timeElapsed);      }
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
        void printArray()
        {
            System.out.println("Bubble Sorted array");
            int n = arr1.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr1[i] + " ");
            System.out.println();
        }
}
