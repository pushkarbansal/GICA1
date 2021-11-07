package comparison;



public class Hybridsort {
    static int[] array;
	long timeElapsed;
    public Hybridsort(int b[])
     {
            // Scanner sc = new Scanner(System.in);
            // long beforeUsedMem;
            // long startMemory = Runtime.getRuntime();
            long startTime = System.nanoTime();
            hybridSort(b, 0 , b.length - 1);
            long endTime = System.nanoTime();
            // long endMemory = Runtime.getRuntime()
            
            // printArray(array);
            timeElapsed = endTime - startTime;
            
            // new Model(timeElapsed/1000000);
    
        
    }
	float val(){
        return (timeElapsed/1000000);
      }
    
	private static void insertionSort(int a[], int low,	int high)
	{
		for (int i = low + 1; i <= high; i++) {
			for (int j = i - 1; j >= low; j--) {
				if (a[j] > a[j + 1]) {
					// Swap
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				else
					break;
			}
		}
	}

	private static int partition(int arr[], int low,
								int high)
	{
		int pivot = arr[high];
		int i = low;
		int j = low;

		while (i <= high) {
			if (arr[i] > pivot)
				i++;
			else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		return j - 1;
	}

	public static void hybridSort(int arr[], int low,
									int high)
	{
		while (low < high) {
			// Check if array size on which we will be working is less than 10
			if (high - low < 10) {
				insertionSort(arr, low, high);
				break;
			}
			else {
				int pivot = partition(arr, low, high);

				// We will do recursion on small size
				// subarray So we can check pivot - low and
				// pivot - high

				if (pivot - low < pivot - high) {
					hybridSort(arr, low, pivot - 1);
					low = pivot + 1;
				}
				else {
					hybridSort(arr, pivot + 1, high);
					high = pivot - 1;
				}
			}
		}
        array = arr;
    
	}

     
        /* Prints the array */
        void printArray()
        {
			System.out.println("Hybrid Sorted array");
            int n = array.length;
            for (int i=0; i<n; ++i)
                System.out.print(array[i] + " ");
            System.out.println();
        }
}