// package Day23;
import java.util.*;
public class MaxAreaInHistogram {
    public static void maxArea(int arr[]){   // 0(3n)=> 0(n)
        int MaxArea = 0;
        int n = arr.length;
        int nsl[] = new int[n];  //nsl = nxtSmallerleft
        int nsr[] = new  int[n];   //nsr = nxtSmallerRight
        // nxtSmallerRight  0(n)
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){ // saari badi val ko nikal de rahe hai
                s.pop();
            }
            nsr[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        // nxtSmallerleft   0(n)
        s = new Stack<>(); // yaha stack empty hogaya
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){ // saari badi val ko nikal de rahe hai
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        // curr area  0(n)
        for(int i=0;i<n;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;//  j-i-1
            int currArea = width * height;
            MaxArea = Math.max(currArea, MaxArea);
        }
        System.out.println("Max Area in Histogram is: "+MaxArea);
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        maxArea(height);
    }
}
