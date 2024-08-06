package Arrays;
import java.util.*;
public class Freq {
    public static void main(String args[]){
        int arr[]={1,2,3,1};
        HashMap <Integer,Integer> m =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            m.put(arr[i]);
        }
    }
}
