class Solution {
    public int distributeCandies(int[] candyType) {
        int candyS=candyType.length/2;
        HashSet<Integer> uniqueELement=new HashSet<>();
        for(int i:candyType){
            uniqueELement.add(i);
        }
        return Math.min(uniqueELement.size(),candyS);

        
    }
}