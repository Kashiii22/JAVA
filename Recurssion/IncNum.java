package Recurssion;

public class IncNum {
    public static void printInc(int n){
        if(n==1){
        System.out.print(n+" "); 
             return;  // Base case: if n equals 1, return from the recursion
        }
        printInc(n-1);
        System.out.print(n+" "); 
        return;
    }
    
    public static void main(String[] args){
        int n=10;
        printInc(n);
    }
}
