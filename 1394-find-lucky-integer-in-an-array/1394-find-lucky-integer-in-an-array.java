class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int luck=-1;
        for(int val:map.keySet()){
            if(map.get(val)==val &&val>luck){
                luck=val;
            }

        }
        return luck;
        
    }
}