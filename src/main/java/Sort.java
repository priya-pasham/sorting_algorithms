public class Sort {
    public static void main(String[] args){
       // int[] unSortedArray = {5,4,3,2,1};
        int[] unSortedArray = {1,52,3,-200,1};
        int n = 5;
        System.out.print("Unsorted Array - ");
        for (int s: unSortedArray){
            System.out.print(s+" ");
        }
        SortInterface sortElements = new QuickSort();
        int[] sortedArray = sortElements.sort(unSortedArray);
        System.out.println();
        System.out.print("Sorted Array - ");
        for (int s: sortedArray){
            System.out.print(s+" ");
        }


    }
}
