class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        int n=s.length();
        int low=0,high=0;
        int res=0;
        for(high=0;high<n;high++){
            char ch=s.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            int k=high-low+1;
            while(freq.size()<k){
                char cl=s.charAt(low);
                freq.put(cl,freq.get(cl)-1);
                if(freq.get(cl)==0){
                    freq.remove(cl);
                }
                low++;
                k=high-low+1;

            }
            if(freq.size()==k){
                res=Math.max(res,high-low+1);
            }
            
        }
        return res;
    }
}