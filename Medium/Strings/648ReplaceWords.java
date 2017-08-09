//648Replace Words

class Trie {
	static class TrieNode{
		boolean isEnd;
		TrieNode[] children;
		TrieNode(){
			isEnd=false;
			children=new TrieNode[26];
		}
		
	}
    private TrieNode root;
 
    public Trie() {
        root = new TrieNode();
    }
    
    public void insertWord(String word){
    	TrieNode p=root;
    	for(int i=0;i<word.length();i++){
    		int idx=word.charAt(i)-'a';
    		if(p.children[idx]==null){
    			TrieNode temp=new TrieNode();
    			p.children[idx]=temp;    			
    		}
    		p=p.children[idx];    		
    	}p.isEnd=true;
    }
    
    public boolean search(String word){
    	TrieNode p=root;
    	for(int i=0;i<word.length();i++){
    		int idx=word.charAt(i)-'a';
    		if(p.children[idx]==null&&i!=word.length()-1){
    			return false;			
    		}
    		p=p.children[idx];    		
    	}
    	return (p!=null)?p.isEnd:false;
    }
    
    public boolean beginsWith(String word){
    	TrieNode p=root;
    	int i=0;
    	for(;i<word.length();i++){
    		int idx=word.charAt(i)-'a';
    		if(p.children[idx]==null&&i!=word.length()-1){
    			return false;			
    		}
    		p=p.children[idx];    		
    	}
    	return true;
    }
}

public class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Trie t=new Trie();
        StringBuilder sb=new StringBuilder();
        for(String x:dict){
            t.insertWord(x);
        }      
        String[] p=sentence.split(" ");
        for(String x:p){       
            boolean found=false;  
            for(int i=1;i<x.length();i++){                     
                if(t.search(x.substring(0,i))){
                    sb.append(x.substring(0,i));
                    found=true;
                    break;
                }                  
            }
            if(!found)sb.append(x);            
            sb.append(" ");
        }        
        String res=new String(sb);
        return res.substring(0,res.length()-1);
    }
}