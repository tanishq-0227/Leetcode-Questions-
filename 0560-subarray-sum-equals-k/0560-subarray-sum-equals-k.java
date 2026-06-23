class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        mpp.put(0,1);//ye jab use kerte hai jab we have to count the no of subarrays 
        int prefixsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            if(mpp.containsKey(prefixsum-k)){
                count+=mpp.get(prefixsum-k);//mpp.get se key ki value le hai
            }

            mpp.put(prefixsum,mpp.getOrDefault(prefixsum,0)+1);//to add keys and values of prefixsum as there value as count

        }
        return count;

    }
}