package leetcode;

public class Trie {

    /** Initialize your data structure here. */
    class TrieNode{
        private TrieNode[] links;// max 26 children
        private final int R = 26;
        private boolean isEnd;
        
        public TrieNode(){
            links = new TrieNode[R];
        }
        
        public boolean containsKey(char ch){
            return links[ch - 'a'] != null;
        }
        
        public TrieNode get(char ch){
            return links[ch - 'a'];
        }
        
        public void put(char ch, TrieNode node){
            links[ch - 'a'] = node;
        }
        
        public void setEnd(){
            isEnd = true;
        }
        
        public boolean isEnd(){
            return isEnd;
        }
    }
    
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(!node.containsKey(c)){
                node.put(c, new TrieNode());
            }
            node = node.get(c);// node = node.links[c - 'a']   node->node.children
        }
        node.setEnd();
    }
    
    
    //search a prefix or whole key in tries
    //return the last searched node
    private TrieNode searchPrefix(String word){
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.containsKey(c)){
                node = node.get(c);
            } else{
                return null;
            }
        }
        return node;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            if(node.containsKey(c))
                node = node.get(c);
            else
                return false;
        }
        return true;
    }
}