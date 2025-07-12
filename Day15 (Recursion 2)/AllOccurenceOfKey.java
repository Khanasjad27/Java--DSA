// package Day15 (Recursion 2);

public class AllOccurenceOfKey {
    public static void Occurence(int arr[], int key,int idx){
        // Base Condition
        if(idx == arr.length){
            return;
        }
        
        // Kaam
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        Occurence(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        int idx = 0; // Staring Index
        Occurence(arr, key,idx);
    }
}
