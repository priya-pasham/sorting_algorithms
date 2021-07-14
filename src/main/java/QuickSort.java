public class QuickSort implements SortInterface{
      @Override
      public int[] sort(int[] array) {
         return quickSort(array,0,array.length-1);
      }

      private int[] quickSort(int[] array, int low, int high) {
        if(low<high) {
            int p = partition(array, low, high);
            quickSort(array, low, p-1);
            quickSort(array, p+1, high);
        }
        return  array;
     }

     private int partition(int[] arr, int low, int high) {
        int m = arr[low];
        int i = low+1;
        int j = high;

        while(i<=j) {
            while (i <= high && arr[i] <= m) i++;
            while (j >= low && arr[j] > m) j--;
            if (i<j) {
                int t= arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }

        arr[low] = arr[j];
        arr[j] = m;
        return j;
    }
}
