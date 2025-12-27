class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];

        //string array ma convert 
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        //jodney ho using custom comparator

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        //lexicographically ab ki ba thulo;


        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();

        
    }
}