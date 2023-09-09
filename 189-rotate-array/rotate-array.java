class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if (n == 0)return;
        k = k % n;
        if (k > n)return;
        
        int temp[]=new int[k];
        for(int i = 0;i<k;i++){
            temp[i]=nums[n-k+i];
        }

        for(int i = 0; i<n-k ;i++){
            nums[n-1-i] = nums[n-1-k-i];
        }

        for(int i = 0;i<k;i++){
            nums[i]=temp[i];
        }
    }
}