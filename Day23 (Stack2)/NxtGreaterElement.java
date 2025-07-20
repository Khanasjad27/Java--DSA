/*cd "c:\Users\Admin\OneDrive\Desktop\Java--DSA"
javac Day23\NxtGreaterElement.java
java Day23.NxtGreaterElement*/

// package Day23;
import java.util.*;

public class NxtGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int[] arr = {6, 8, 0, 1, 3};
        int[] nxtGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop indices whose values are <= current value
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {  // saare choti val ko nikal de rahe hai
                s.pop();
            }
            // Record answer
            nxtGreater[i] = s.isEmpty() ? -1 : arr[s.peek()];
            // Push current index
            s.push(i);
        }

        // Print result
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
