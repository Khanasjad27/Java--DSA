// package Day16 (Divide and Conqure);
//Given an array nums of size n, returnthe majority element. The majority element is the element that appears more than ⌊n/2⌋ times.You may assume that the majority element always exists in the array.

public class MajorityInArray {
    public static int majority(int arr[]){
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }       
            }
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
}
