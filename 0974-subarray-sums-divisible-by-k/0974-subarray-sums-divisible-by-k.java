class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        mpp.put(0,1);
        int prefixsum=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int rem=prefixsum % k;
            if(rem<0){
                rem+=k;
            }
            if(mpp.containsKey(rem)){
            //    mpp.get(rem);
               total+=mpp.get(rem);
            }

            mpp.put(rem,mpp.getOrDefault(rem,0)+1);
        }
        return total;
    }
}