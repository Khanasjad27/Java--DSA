// Enter cost of 3 items from the user(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        // Input
        float pen = scn.nextFloat();
        float pencil = scn.nextFloat();
        float eraser = scn.nextFloat();
        // Without GST claculation
        float withoutGST = pen+pencil+eraser;
        // Without GST claculation
        float withGST = withoutGST + withoutGST*0.18f;

        // Printing
        System.out.println(withoutGST);
        System.out.println(withGST);
    }
}