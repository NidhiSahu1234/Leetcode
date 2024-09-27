import java.util.HashMap;
public class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap <Integer,Integer> hash = new HashMap<>();
        int n = nums.length;
        
        for(int i = 0;i<n;i++)
        {
            hash.put(nums[i],i);
        }

        

        for(int i=0;i<n;i++)
        {
            if(target== nums[i] && hash.containsKey(0))
            {
                 return new int[] {i,hash.get(0)};
            }

            else if(hash.containsKey(target-nums[i]))
            { 
                if(hash.get(target-nums[i]) > i)
                {
                return new int[] {i,hash.get(target-nums[i])};
                }
            }
        }

         return new int[] {-1,-1};
        
    }
}