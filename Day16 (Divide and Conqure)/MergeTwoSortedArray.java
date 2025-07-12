public class MergeTwoSortedArray {
    public static void Merge(int arr1[], int n, int arr2[], int m) {
        int i = n - 1; // last index of arr1 valid elements
        int j = m - 1; // last index of arr2
        int k = m + n - 1; // last index of total merged array

        // Merge from back to front
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // If arr2 still has elements
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
        // If arr1 still has elements
        while (i >= 0) {
            arr1[k--] = arr2[i--];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[9]; // 5 elements + space for 4 more
        int[] initial = {10, 30, 40, 70, 80};
        for (int i = 0; i < initial.length; i++) {
            arr1[i] = initial[i];
        }

        int[] arr2 = {20, 40, 50, 60};

        Merge(arr1, 5, arr2, 4);

        System.out.print("Merged Array: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}


// or

// iski TS zada hai
/*
// package Day16 (Divide and Conqure);
// leetcode 88
public class MergeTwoSortedArray {
    public static void Merge(int arr1[],int n,int arr2[],int m){
        int i = n-1; // iteretor for 1st array
        int j = m-1; // iteretor for 2nd array
        // iterator for first array for adding elements of a & b in sorted order
        for(int k=m+n-1;k>=0;k--){
            int val1 = (i<0) ? Integer.MIN_VALUE: arr1[i];   // agar i ka index -1 chalegai to usme hum -Infinity store karege
            int val2 = (j<0) ? Integer.MIN_VALUE: arr2[j];
            if(val1<val2){
                arr1[k] = val2;
                j--;
            }else{
                arr1[k] = val1;
                i--;
            }
            System.out.print(arr1[k]+" ");
        }
    }
}

 */
