
public class Problem2
{
    public static void main() {
        int[] nums = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < nums.length; i++) 
            if(sum < nums[i]) sum+=nums[i];
        System.out.println("A: " + sum);
        sum = 0;
        for(int i = 0; i < nums.length; i++)
            if(sum > nums[i]) sum+=nums[i];
        System.out.println("B: " + sum);
        sum = 0;
        for(int i = 0; i < nums.length; i++)
            if(sum < nums[i]) sum=nums[i];
        System.out.println("C: " + sum);
        sum = 0;
        for(int i = 0; i < nums.length; i++)
            if(sum > nums[i]) sum=nums[i];
        System.out.println("D: " + sum);
        sum = 0;
        for(int i = 0; i < nums.length; i++) 
            if(sum == nums[i]) sum = 5;
        System.out.println("E: " + sum);
    }

}
