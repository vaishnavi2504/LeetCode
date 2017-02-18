//https://leetcode.com/problems/implement-trie-prefix-tree/?tab=Description

class TrieNode{
    boolean isEnd;
    TrieNode[] children;
    TrieNode(){
        children=new TrieNode[26];
    }
}


public class Trie {
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode p=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int idx=c-'a';
            if(p.children[idx]==null){
                //create a new node and attach it at the idx
                TrieNode temp=new TrieNode();
                p.children[idx]=temp;
                p=p.children[idx];
            }else{
                p=p.children[idx];
            }
        }
        p.isEnd=true;
        
    }
    
    /** Returns if the word is in the trie. */
    //It's important that you check for the isEnd flag
    public boolean search(String word) {
        TrieNode p=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int idx=c-'a';
            if(p.children[idx]==null)return false;
            else{
                p=p.children[idx];
            }
        }return p.isEnd==true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    //Pretty much similar to the search.
    public boolean startsWith(String prefix) {
        TrieNode p=root;
        for(int i=0;i<prefix.length();i++){
            char c=prefix.charAt(i);
            int idx=c-'a';
            if(p.children[idx]==null)return false;
            else{
                p=p.children[idx];
            }
        }return true;
    }
}
