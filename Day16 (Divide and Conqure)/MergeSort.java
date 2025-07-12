// package Day16 (Divide and Conqure);

public class MergeSort {
    
    public static void Msort(int arr[],int si, int ei){
        // base
        if(si>=ei){
            return;
        }
        
        // kaam
        int mid = si + (ei-si)/2;
        Msort(arr, si, mid);  // left sort
        Msort(arr, mid+1, ei); // right sort
        // upar sort hogaya ab muje sorted ko merge karna hai uske liya dusra function banaya hai
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;  // iterator for left part
        int j = mid +1; // iterator for right part
        int k = 0; //iterator for temp arr

        while(i<=mid && j<=ei){  
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;//k++;
            }else{
                temp[k] = arr[j];
                j++;//k++;
            }
            k++;  // dono me k++ tha therefore k++ commom karke niche likh liya
        }
        // upar waala loop chalne ke baad agar kuch element bach gai to uske liya
        // left part
        while(i<=mid){
            temp[k++] = arr[i++];  // phele temp[k] me arr[i] ke val then increment
        }
        // right part
        while(j<=ei){
            temp[k++] = arr[j++];  // phele temp[k] me arr[j] ke val then increment
        }

        // upar waala code tak temp me saare aagae hai
        // now copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-5 };
        Msort(arr, 0, arr.length-1);
        print(arr);
    }
}
