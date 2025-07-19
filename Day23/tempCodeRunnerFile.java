package Day23;
import java.util.*;
public class NxtGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i++){
            // S1
            while (!s.isEmpty()&& arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            //S2
            if(!s.isEmpty()){
                nxtGreater[i]= -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            // S3
            s.push(i);
        }
        for(int i=0;i<nxtGreater.length-1;i++){
            System.out.print(nxtGreater[i]+" ");
        }
    }
}
