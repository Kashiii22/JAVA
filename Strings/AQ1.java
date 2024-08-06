package Strings;

public class AQ1 {
    public static int vowel(String str){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                sb.append(str.charAt(i));
                count++;
}  
      }
      return count;
    }
    public static void main(String args[]){
        String str="kaashiii";
        System.out.println(vowel(str));
    }
}
