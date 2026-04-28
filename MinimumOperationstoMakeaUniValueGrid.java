class Solution {
    public int minOperations(int[][] grid, int x) {
        int a=grid.length, b=grid[0].length;
        int[] arr=new int[a*b];
        int k=0;
        for(int i=0;i<a;i++)
        {
           for(int j=0;j<b;j++)
           {
             arr[k++]=grid[i][j];
           }
        }

        Arrays.sort(arr);

        int rem=arr[0]%x;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]%x!=rem) return -1;
        }

        int med=arr[arr.length/2];
        int ans=0;

        for(int i=0;i<arr.length;i++)
        {
            ans+=Math.abs(arr[i]-med)/x;
        }
        return ans;
    }
}


Space Complexity=O(a*b)
Time Complexity=O(ab*log(ab))
