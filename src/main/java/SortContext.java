public class SortContext {

    SortInterface sort;
    int[] arr;
    public SortContext(SortInterface sort, int arr[]) {
        this.sort =  sort;
        this.arr =arr;
    }
    public int[] sortArray(){
        return sort.sort(arr);
    }
}
