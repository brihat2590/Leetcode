class Solution {

    public int findOcc(String haystack, String needle){
        int firstindex=haystack.indexOf(needle);
        int lastindex=haystack.indexOf(needle);
        if(firstindex==-1){
            return -1;
        }
        if(firstindex==lastindex){
            return firstindex;
        }
        return firstindex;
    }
    public int strStr(String haystack, String needle) {
        int result=findOcc(haystack,needle);
        return result;
    }
}