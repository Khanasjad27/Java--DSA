// package Day18 (BackTracking);

public class InArray {
    // public static void backTrackingInArray(int arr[]){
    //     int n = arr.length;
    //     for(int i=0;i<5;i++){
    //         arr[i] = i+1;
    //     }
    //     for(int i=0;i<5;i++){
    //         arr[i] = arr[i]-2;
    //     }
    //     print(arr);
    // }
    public static void changeArr(int arr[],int i, int val){
        // Base case
        if(i==arr.length){
            // print(arr);
            return;
        }

        // Recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] -2; // jab call wapis aai tab usme -2 kardiya
        
    }
    public static void print(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        // backTrackingInArray(arr);
        changeArr(arr, 0, 1);
        print(arr);
    }
}
