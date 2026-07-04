class Solution {
    public int findMiddleIndex(int[] nums) {
        int maxl[]= new int[nums.length];
        int maxr[]= new int[nums.length];
        maxl[0]=0;
        maxr[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            maxl[i]=maxl[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            maxr[i]=maxr[i+1]+nums[i+1];
        }
        for(int i=0;i<maxl.length;i++){
            if(maxl[i]==maxr[i]){
                return i;
            }
        }
        return -1;
    }
}