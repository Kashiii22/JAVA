public class Selection {
    public static void selection(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int pos=i;
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[pos]>nums[j]){
                    pos=j;
                }
            }
            int temp=nums[pos];
            nums[pos]=nums[i];
            nums[i]=temp;
        }
    }
    public static void main(String[] args){
        int nums[]={5,3,1,2,7,4,5};
        selection(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
