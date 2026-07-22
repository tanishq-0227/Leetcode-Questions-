class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total_needed = 0;
        int needed = 0;
        int st = 0;
        
        for(int i = 0; i < n; i++){
            total_needed += gas[i] - cost[i];
            needed += gas[i] - cost[i];
            if(needed < 0){
                needed = 0;
                st = i + 1;
            }
        }
        return (total_needed < 0) ? -1 : st;
    }
}