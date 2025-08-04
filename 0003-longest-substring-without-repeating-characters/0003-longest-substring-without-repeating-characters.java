class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0 ||s==null) return 0;
        if(s.length()==1) return 1;

        int left=0;
        int right=0;
        int ans=0;

        HashSet<Character> hash=new HashSet<>();

        while(right<s.length()){
            char c=s.charAt(right);
            while(hash.contains(c)){
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(c);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
        
    }
}