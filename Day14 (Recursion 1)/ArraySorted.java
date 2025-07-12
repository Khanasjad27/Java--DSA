// package Day14 (Recurssion 1);

public class ArraySorted {
    public static boolean isSorted(int arr[],int i){
        // Base Condition
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,9,4,5};
        int i = 0;
        System.out.println(isSorted(arr, i));
    }
}
