class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int C=0;
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(mpp.containsKey(c)){
               return new int[]{mpp.get(c),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{};

    }
}