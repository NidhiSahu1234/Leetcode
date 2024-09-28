class Solution {
    public long maximumTotalSum(int[] maximumHeight) 
    {

     Arrays.sort(maximumHeight);

     int min = Integer.MAX_VALUE;

     long sum = 0;

     for(int i=maximumHeight.length-1;i>=0;i--)
     {
        int currHeight = Math.min(maximumHeight[i],min-1);

        if(currHeight<=0)
        {
            return -1;
        }

        sum += currHeight;

        min = currHeight;
     }

      return sum;  
    }
}