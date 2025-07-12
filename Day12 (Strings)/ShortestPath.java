// package Day12 (Strings);

import java.util.Scanner;

public class ShortestPath {
    public static float shortPath(String path){   // yaha float banaya hai coz sq root waala float val return karta hai
        int x=0,y=0;     // both cordinates are at origin
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int X2 = x*x;   // (x-0)*(x-0) => x*x
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);  // yaha float me typecast kya hai cox ya hume double return karra tha 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String dir = "WNEENESENNN";
        System.out.println(shortPath(dir));
    }
}
