class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        int maxFrequency=0;


        for( char str:s.toCharArray()){
            int freq=map.getOrDefault(str,0)+1;
            map.put(str,freq);
            maxFrequency=Math.max(freq,maxFrequency);
            
        }

        StringBuilder sb=new StringBuilder();
        for(int freq=maxFrequency;freq>=1;freq--){
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                if(entry.getValue()==freq){
                    for(int i=0;i<freq;i++){
                        sb.append(entry.getKey());
                    }
                }
            }
        }

        return sb.toString();

        
        
    }
}