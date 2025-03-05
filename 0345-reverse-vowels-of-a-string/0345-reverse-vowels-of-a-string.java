class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> hash=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        char temp;
        while(left<right){
            while(left<right && !hash.contains(arr[left])){
                left++;
                
            }
            while(left<right && !hash.contains(arr[right])){
                
                right--;
            }
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            

        }
        return new String(arr);
        
        
    }
}