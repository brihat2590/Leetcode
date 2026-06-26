class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] s=new String[score.length];

        HashMap<Integer,Integer> map=new HashMap<>();
        

        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        int[] clone = Arrays.stream(score)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();

        for(int i=0;i<clone.length;i++){
            int current=clone[i];
            int originalIndex=map.get(current);

            if(i==0){
                s[originalIndex]="Gold Medal";
            }
            else if(i==1){
                s[originalIndex]="Silver Medal";
            }
            else if(i==2){
                s[originalIndex]="Bronze Medal";
            }
            else{
                s[originalIndex]=String.valueOf(i+1);
            }
        }
        return s;
        
    }
}