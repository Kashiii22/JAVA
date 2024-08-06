package Arrays;
// public class Arrays {
//     public static int linearSearch(int numbers[],int key){

//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int[] numbers={10,20,30,40,50};
//         int key=30;
//         int index=linearSearch(numbers,key);
//         if(index==-1){
//             System.out.println("Element not found");
//         }else{
//             System.out.println("Element found at index "+index);
//         }
//     }
// }


import java.util.*;
public class Array{
    public static int largest(int numbers[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>large){
                large=numbers[i];
            }
        }
        return large;
    }
    public static void main(String[] args){
        int numbers[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        int large=largest(numbers);
        System.out.println("Largest element is "+large);

}
}