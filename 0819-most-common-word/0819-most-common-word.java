class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban=new HashSet(Arrays.asList(banned));
        HashMap<String,Integer> wordCount=new HashMap<>();
        String cleaned = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", " ");

        String[] words=cleaned.split("\\s+");


        for(String s:words){
            if(!ban.contains(s)){
                wordCount.put(s,wordCount.getOrDefault(s,0)+1);
            }

        }
        String mostCommon="";
        int max=0;

        for(String s:wordCount.keySet()){
            int count=wordCount.get(s);
            if(count>max){
                mostCommon=s;
                max=count;
            }
        }
        return mostCommon;

        
        

       
        
        
    }
}