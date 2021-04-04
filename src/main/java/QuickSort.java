public class QuickSort implements SortInterface{
    @Override
    public int[] sort(int[] arr, int low, int high) {

    if(low<high) {
        int p = partion(arr, low, high);

        sort(arr, low, p-1);
        sort(arr, p+1, high);
    }
    return  arr;
    }

    private int partion(int[] arr, int low, int high) {
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
