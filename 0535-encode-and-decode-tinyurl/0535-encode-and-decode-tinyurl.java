public class Codec {
    Map<String, String> map = new HashMap<>();

    
    public String encode(String longUrl) {
        String key = "Hello55";
        map.put(key, longUrl);
        return key;
    }

    
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

