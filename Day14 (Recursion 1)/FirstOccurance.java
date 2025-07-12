// package Day14 (Recurssion 1);

public class FirstOccurance {
    public static int first(int arr[] , int i, int key){
        if(i == arr.length){
            return -1;  // key not found
        }
        if(arr[i] == key){
            return i;
        }
        return first(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,4,6,7,0,5,6,1};
        int i = 0;
        int key = 5;
        System.out.println(first(arr, i, key));
    }
}
