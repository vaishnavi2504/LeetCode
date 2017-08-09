public class Codec {
    Map<String,String> map=new HashMap<>();
    Map<String,String> revMap=new HashMap<>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String s=randomString();
        while(map.containsKey(s)){
             s=randomString();           
        }
        map.put(s,longUrl);
        revMap.put(longUrl,s);
        return s;
    }
    
    public String randomString(){
        String s="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rand = new Random();        
        int High = s.length()-1;
        int r = rand.nextInt(High);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<6;i++){
            sb.append(s.charAt(i));
        }return new String(sb);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));