// package Day16 (Divide and Conqure);

public class QuickSort {
    public static void Qsort(int arr[],int si,int ei){
        // Base case
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr,si,ei);  // pivot index 
        // left
        Qsort(arr, si, pIdx-1); // yaha hame si to pIdx -1 tak sort karna hai coz pidx already sort hai
        // right
        Qsort(arr, pIdx+1, ei);
        
    }
    public static int partition(int arr[], int si,int ei){
        // ya fn pivot ke idx ko return karega
        int pivot = arr[ei];  // pivot is last element
        int i = si - 1;
        for(int j=si;j<=ei;j++){
            if(arr[j]<=pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }  

        // niche jo likha hai wo ma'am ne likhaya tha for alag se pivot ke liya lakin mai ne upar waale loop me j<=ei likha hai jo ki barabar kaam karra hai

        // i++;
        // // swap
        // int temp = pivot;
        // arr[ei] = arr[i];  // yaha pivot val hai jo ki ei ke barabar hai
        // arr[i] = temp;

        return i;  // ya pivot ka sahi index hai
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-5 };
        Qsort(arr, 0, arr.length-1);
        print(arr);
    }
}
