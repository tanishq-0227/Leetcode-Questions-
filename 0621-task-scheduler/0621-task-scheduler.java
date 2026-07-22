class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq= new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        int maxfreq=0;
        for(int i=0;i<26;i++){
            maxfreq=Math.max(maxfreq,freq[i]);
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(freq[i]==maxfreq){
                c++;
            }
        }
        return Math.max(tasks.length,(maxfreq-1)*(n+1)+c);
    }
}