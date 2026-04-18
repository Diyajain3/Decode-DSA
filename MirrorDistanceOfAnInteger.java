class Solution {
    public int mirrorDistance(int n) {
        int k=n;
        int rev=0;
        if(n/10==0) return 0;//single digit case
        while(k>0)//finding reverse of a number
        {
           rev=(rev*10)+(k%10);
           k=k/10;
        }
        return Math.abs(n-rev);//return absolute of subtraction of digits and its reverse
    }
}

⏱ Complexity
Time Complexity: O(d) → where d = number of digits
Space Complexity: O(1)
