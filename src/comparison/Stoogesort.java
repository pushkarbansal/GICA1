package comparison;

public class Stoogesort {
  public Stoogesort(int[] b) {
       // Scanner sc = new Scanner(System.in);
        //    long beforeUsedMem;
           // long startMemory = Runtime.getRuntime();
           long startTime = System.nanoTime();
           int n = b.length;
           int arr1[] = stoogesort(b, 0, n - 1);
           long endTime = System.nanoTime();
           // long endMemory = Runtime.getRuntime()
           System.out.println("Sorted array");
           printArray(arr1, n);
           long timeElapsed = endTime - startTime;
           
           new Model(timeElapsed/1000000);
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
    public static void printArray(int[] arr, int n)
	{
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
    }
}
