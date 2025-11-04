class Trie {

    private Node root;
    private static class Node{
        Node[] children=new Node[26];
        boolean eow=false;

    }

    public Trie() {
        root=new Node();

        
    }
    
    public void insert(String word) {
        Node current=root;

        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(current.children[idx]==null){
                current.children[idx]=new Node();
            }
            current=current.children[idx];
        }
        current.eow=true;
        
    }
    
    public boolean search(String word) {
        Node current=root;

        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(current.children[idx]==null){
                return false;
            }
            current=current.children[idx];

        }
        return current.eow;
        
    }
    
    public boolean startsWith(String prefix) {

        Node current=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(current.children[idx]==null){
                return false;
            }
            current=current.children[idx];
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */