package comparison;

public class Stoogesort {
    int[] arr1;
    long timeElapsed;
  public Stoogesort(int[] b) {
       // Scanner sc = new Scanner(System.in);
        //    long beforeUsedMem;
           // long startMemory = Runtime.getRuntime();
           long startTime = System.nanoTime();
           int n = b.length;
           arr1 = stoogesort(b, 0, n - 1);
           long endTime = System.nanoTime();
           // long endMemory = Runtime.getRuntime()
           
        //    printArray(arr1, n);
           timeElapsed = endTime - startTime;
           
           new Model(timeElapsed/1000000);
  }
  float val(){
    return (timeElapsed/1000000);
  }
  
    static int[] stoogesort(int arr[], int l, int h)
    {
        if (l >= h)
            return null;

        // If first element is smaller
        // than last, swap them
        if (arr[l] > arr[h]) {
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
        }

        // If there are more than 2 elements in
        // the array
        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;

            // Recursively sort first 2/3 elements
            stoogesort(arr, l, h - t);

            // Recursively sort last 2/3 elements
            stoogesort(arr, l + t, h);

            // Recursively sort first 2/3 elements
            // again to confirm
            stoogesort(arr, l, h - t);
        }
        return arr;
    }
    void printArray()
	{
        int n = arr1.length;
        System.out.println("Stooge Sorted array");
		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n");
    }
}
