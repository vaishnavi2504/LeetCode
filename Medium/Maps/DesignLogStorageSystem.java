//https://leetcode.com/contest/leetcode-weekly-contest-39/problems/design-log-storage-system/
//635. Design Log Storage System



public class LogSystem {
    Map<Integer,String> map;
    Map<String,Integer> idx;
    
    public LogSystem() {
        map=new TreeMap<>();
        idx=new HashMap<>();
        String[] g={"Year", "Month", "Day", "Hour", "Minute", "Second"};
        int[] i={4,7,10,13,16,19};
        for(int k=0;k<g.length;k++)idx.put(g[k],i[k]);
    }
    
    public void put(int id, String timestamp) {
        map.put(id,timestamp);
    }
    
    //If granularity is year then extract only year part from the string, if it's month then extract year+month  and so on
	public List<Integer> retrieve(String s, String e, String gra) {
        List<Integer> res=new ArrayList<>();
        int pad=idx.get(gra);
        s=s.substring(0,pad);
        e=e.substring(0,pad);
        for(int x: map.keySet()){
            String a=map.get(x);
            a=a.substring(0,pad);
            if(a.compareTo(s)>=0&&a.compareTo(e)<=0)res.add(x);
        }
        return res;
    }
}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(s,e,gra);
 */