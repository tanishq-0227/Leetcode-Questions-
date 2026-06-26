class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int onedelete=0;
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int oldno=nodelete;
            int v1=arr[i];
            int v2=arr[i]+nodelete;
            int v3=arr[i]+onedelete;
            nodelete=Math.max(v1,v2);
            onedelete=Math.max(v3,oldno);
            res=Math.max(res,Math.max(onedelete,nodelete));
        }
        return res;
    }
}